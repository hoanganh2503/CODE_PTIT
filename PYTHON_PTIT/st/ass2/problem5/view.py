import tkinter as tk
from tkinter import messagebox, PhotoImage, Label, Toplevel, Entry, Button, filedialog
from PIL import Image, ImageTk
from controller import InventoryController

class InventoryApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Inventory Management System")
        self.products = []
        self.selected_product_id = None
        self.create_widgets()
        
    def create_widgets(self):
        self.title_label = tk.Label(self.root, text="Inventory Management System", font=("Arial", 18, 'bold'))
        self.title_label.pack(pady=(20, 0), padx=10, fill=tk.X)
        # sidebar bên trái chứa list sản phẩm
        self.product_listbox = tk.Listbox(self.root, width=25, height=100)
        self.product_listbox.pack(side=tk.LEFT, padx=0, pady=(30, 0))
        self.product_listbox.bind('<<ListboxSelect>>', self.on_select)

        # Khung hiển thị chi tiết sản phẩm  
        self.details_frame = tk.Frame(self.root)
        self.details_frame.pack(side=tk.LEFT, padx=30, pady=40, fill=tk.BOTH, expand=True)

        self.name_label = tk.Label(self.details_frame, text=f"Name:--", font=("Arial", 12))
        self.name_label.pack(anchor='center')

        self.price_label = tk.Label(self.details_frame, text="Price:--", font=("Arial", 12))
        self.price_label.pack(anchor='center')

        self.description_label = tk.Label(self.details_frame, text="Description:--", font=("Arial", 12))
        self.description_label.pack(anchor='center')

        # Khung hiển thị hình ảnh
        self.image_label = Label(self.details_frame)
        self.image_label.pack(fill=tk.BOTH, expand=True)

        self.add_button = tk.Button(self.details_frame, text="Add Product", command=self.show_add_product_form)
        self.add_button.pack(side=tk.LEFT, pady=(20, 0), padx=10)

        self.show_button = tk.Button(self.details_frame, text="Show Details", command=self.show_details)
        self.show_button.pack(side=tk.LEFT, pady=(20, 0), padx=10)

        self.update_button = tk.Button(self.details_frame, text="Update Product", command=self.show_update_product_form)
        self.update_button.pack(side=tk.LEFT, pady=(20, 0), padx=10)

        self.delete_button = tk.Button(self.details_frame, text="Delete Product", command=self.delete_product)
        self.delete_button.pack(side=tk.LEFT, pady=(20, 0), padx=10)

        self.delete_button = tk.Button(self.details_frame, text="Help", command=self.delete_product)
        self.delete_button.pack(side=tk.LEFT, pady=(20, 0), padx=10)

        self.exit_button = tk.Button(self.details_frame, text="Exit", command=self.root.quit)
        self.exit_button.pack(side=tk.LEFT, pady=(20, 0), padx=10)

    def on_select(self, event):
        selection = self.product_listbox.curselection()
        if selection:
            self.selected_product_id = selection[0]
            self.update_details()

    def update_details(self):
        if self.selected_product_id != None:
            current_selected_product = InventoryController.get_current_product(self.selected_product_id)
            self.name_label.config(text=f"Name: {current_selected_product.name}")
            self.price_label.config(text=f"Price: ${current_selected_product.price:.2f}")
            self.description_label.config(text=f"Description: {current_selected_product.description}")

            # Cập nhật hình ảnh
            try:
                image = Image.open(current_selected_product.image_path)
                image = image.resize((300, 200), Image.ANTIALIAS)  # Thay đổi kích thước hình ảnh
                self.image_label.image = ImageTk.PhotoImage(image)
                self.image_label.config(image=self.image_label.image)
            except Exception as e:
                self.image_label.config(text="Image not found.")
        else:
            self.name_label.config(text="Name:--")
            self.price_label.config(text="Price:--")
            self.description_label.config(text="Description:--")
            self.image_label.image = ''

    def show_add_product_form(self):
        form_window = Toplevel(self.root)
        form_window.title("Add Product")
        form_window.geometry("600x400")

        tk.Label(form_window, text="Product Name:").grid(row=0, column=0, padx=10, pady=5)
        name_entry = Entry(form_window, width=60)
        name_entry.grid(row=0, column=1, padx=10, pady=5)

        tk.Label(form_window, text="Price:").grid(row=1, column=0, padx=10, pady=5)
        price_entry = Entry(form_window, width=60)
        price_entry.grid(row=1, column=1, padx=10, pady=5)

        tk.Label(form_window, text="Description:").grid(row=2, column=0, padx=10, pady=5)
        description_entry = tk.Text(form_window, width=45, height=4)
        description_entry.grid(row=2, column=1, padx=10, pady=5)

        tk.Label(form_window, text="Image Path:").grid(row=3, column=0, padx=10, pady=5)
        image_entry = Entry(form_window, width=60, state='readonly')
        image_entry.grid(row=3, column=1, padx=10, pady=5)

        def browse_image():
            filename = filedialog.askopenfilename(filetypes=[("Image Files", "*.jpg;*.jpeg;*.png")])
            if filename:
                image_entry.config(state='normal')
                image_entry.delete(0, tk.END)
                image_entry.insert(0, filename)
                image_entry.config(state='readonly') 

        browse_button = Button(form_window, text="Browse", command=browse_image)
        browse_button.grid(row=3, column=2, padx=10, pady=5)

        def add_product_to_inventory():
            name = name_entry.get()
            price = price_entry.get()
            description = description_entry.get("1.0",'end-1c')
            image_path = image_entry.get()

            create_message = InventoryController.create_product(name, price, description, image_path)
            if create_message != True:
                messagebox.showerror("Error", create_message)
            else:
                self.product_listbox.insert(tk.END, name)
                form_window.destroy()
                messagebox.showwarning("Success", "Add product Successfully")


        add_button = tk.Button(form_window, text="Add Product", command=add_product_to_inventory)
        add_button.grid(row=4, column=0, columnspan=3, pady=10)

    def show_update_product_form(self):
        if self.selected_product_id == None:
            messagebox.showwarning("Warning", "Please select a product to update.")
            return

        form_window = Toplevel(self.root)
        form_window.title("Update Product")
        form_window.geometry("600x400")

        current_selected_product = InventoryController.get_current_product(self.selected_product_id)

        tk.Label(form_window, text="Product Name:").grid(row=0, column=0, padx=10, pady=5)
        name_entry = Entry(form_window, width=60)
        name_entry.insert(0, current_selected_product.name)
        name_entry.grid(row=0, column=1, padx=10, pady=5)

        tk.Label(form_window, text="Price:").grid(row=1, column=0, padx=10, pady=5)
        price_entry = Entry(form_window, width=60)
        price_entry.insert(0, current_selected_product.price)
        price_entry.grid(row=1, column=1, padx=10, pady=5)

        tk.Label(form_window, text="Description:").grid(row=2, column=0, padx=10, pady=5)
        description_entry = tk.Text(form_window, width=45, height=4)
        description_entry.insert("1.0", current_selected_product.description)
        description_entry.grid(row=2, column=1, padx=10, pady=5)

        tk.Label(form_window, text="Image Path:").grid(row=3, column=0, padx=10, pady=5)
        image_entry = Entry(form_window, width=60)
        image_entry.insert(0, current_selected_product.image_path)
        image_entry.config(state='readonly') 
        image_entry.grid(row=3, column=1, padx=10, pady=5)

        def browse_image():
            filename = filedialog.askopenfilename(filetypes=[("Image Files", "*.jpg;*.jpeg;*.png")])
            if filename:
                image_entry.config(state='normal')
                image_entry.delete(0, tk.END)
                image_entry.insert(0, filename)
                image_entry.config(state='readonly')

        browse_button = Button(form_window, text="Browse", command=browse_image)
        browse_button.grid(row=3, column=2, padx=10, pady=5)

        def update_product_in_inventory():
            name = name_entry.get()
            price = price_entry.get()
            description = description_entry.get("1.0",'end-1c')
            image_path = image_entry.get()

            update_product = InventoryController.update_product(self.selected_product_id, name, price,  description, image_path)
            if update_product == True:
                    self.product_listbox.delete(self.selected_product_id)
                    self.product_listbox.insert(self.selected_product_id, name)
                    form_window.destroy()
                    self.update_details()
                    messagebox.showwarning("Success", "Update product Successfully")
            else:
                messagebox.showerror("Error", update_product)


        update_button = tk.Button(form_window, text="Update Product", command=update_product_in_inventory)
        update_button.grid(row=4, column=0, columnspan=3, pady=10)

    def show_details(self):
        if self.selected_product_id != None:
            current_selected_product = InventoryController.get_current_product(self.selected_product_id)
            # Tạo cửa sổ mới
            details_window = Toplevel(self.root)
            details_window.title("Product Details")
            details_window.geometry("500x300")

            # Hiển thị thông tin sản phẩm
            info_label = Label(details_window, 
                text=f"Name: {current_selected_product.name}\n"
                    f"Price: ${current_selected_product.price:.2f}\n"
                    f"Description: {current_selected_product.description}")
            info_label.pack(pady=10)

            # Hiển thị hình ảnh
            image_path = current_selected_product.image_path
            if image_path:
                image = Image.open(image_path)
                image = image.resize((300, 200), Image.ANTIALIAS)
                photo = ImageTk.PhotoImage(image)

                image_label = Label(details_window, image=photo)
                image_label.image = photo
                image_label.pack(pady=10)
        else:
            messagebox.showwarning("Warning", "Please select a product to view details.")

    def delete_product(self):
        if self.selected_product_id != None:
            if InventoryController.delete_product(self.selected_product_id) == True:
                self.product_listbox.delete(self.selected_product_id)
                self.selected_product_id = None
                messagebox.showwarning("Success", "Product deleted successfully")
                self.update_details()
            else:
                messagebox.showerror("Error", "Failed to delete product.")
        else:
            messagebox.showwarning("Warning", "Please select a product to delete.")