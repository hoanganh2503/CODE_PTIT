import tkinter as tk
from tkinter import messagebox, PhotoImage, Label, Toplevel, Entry, Button, filedialog
from PIL import Image, ImageTk

class Product:
    def __init__(self, name, price, description, image_path):
        self.name = name
        self.price = price
        self.description = description
        self.image_path = image_path

class InventoryApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Inventory Management System")
        self.products = []
        self.selected_product = None
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

        self.name_label = tk.Label(self.details_frame, text=f"Name:", font=("Arial", 12))
        self.name_label.pack(anchor='center')

        self.price_label = tk.Label(self.details_frame, text="Price:", font=("Arial", 12))
        self.price_label.pack(anchor='center')

        self.description_label = tk.Label(self.details_frame, text="Description:", font=("Arial", 12))
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
            index = selection[0]
            self.selected_product = self.products[index]
            self.update_details()

    def update_details(self):
        if self.selected_product:
            self.name_label.config(text=f"Name: {self.selected_product.name}")
            self.price_label.config(text=f"Price: ${self.selected_product.price:.2f}")
            self.description_label.config(text=f"Description: {self.selected_product.description}")

            # Cập nhật hình ảnh
            try:
                image = Image.open(self.selected_product.image_path)
                image = image.resize((300, 200), Image.ANTIALIAS)  # Thay đổi kích thước hình ảnh
                self.image_label.image = ImageTk.PhotoImage(image)
                self.image_label.config(image=self.image_label.image)
            except Exception as e:
                self.image_label.config(text="Image not found.")

    def show_add_product_form(self):
        form_window = Toplevel(self.root)
        form_window.title("Add Product")
        
        # Đặt kích thước cho cửa sổ
        form_window.geometry("600x400")  # Thay đổi kích thước theo nhu cầu

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
        image_entry = Entry(form_window, width=60)
        image_entry.grid(row=3, column=1, padx=10, pady=5)

        def browse_image():
            filename = filedialog.askopenfilename(filetypes=[("Image Files", "*.jpg;*.jpeg;*.png")])
            if filename:
                image_entry.delete(0, tk.END)
                image_entry.insert(0, filename)

        browse_button = Button(form_window, text="Browse", command=browse_image)
        browse_button.grid(row=3, column=2, padx=10, pady=5)

        def add_product_to_inventory():
            name = name_entry.get()
            price = price_entry.get()
            description = description_entry.get("1.0",'end-1c')
            image_path = image_entry.get()

            try:
                price = float(price)  # Chuyển đổi giá thành số
                if name and price >= 0 and description and image_path:
                    product = Product(name, price, description, image_path)
                    self.products.append(product)
                    self.product_listbox.insert(tk.END, product.name)
                    form_window.destroy()
                else:
                    messagebox.showerror("Error", "Please fill all fields correctly.")
            except ValueError:
                messagebox.showerror("Error", "Price must be a number.")

        add_button = tk.Button(form_window, text="Add Product", command=add_product_to_inventory)
        add_button.grid(row=4, column=0, columnspan=3, pady=10)

    def show_update_product_form(self):
        if not self.selected_product:
            messagebox.showwarning("Warning", "Please select a product to update.")
            return

        form_window = Toplevel(self.root)
        form_window.title("Update Product")
        form_window.geometry("600x400")  # Thay đổi kích thước theo nhu cầu

        tk.Label(form_window, text="Product Name:").grid(row=0, column=0, padx=10, pady=5)
        name_entry = Entry(form_window, width=60)
        name_entry.insert(0, self.selected_product.name)
        name_entry.grid(row=0, column=1, padx=10, pady=5)

        tk.Label(form_window, text="Price:").grid(row=1, column=0, padx=10, pady=5)
        price_entry = Entry(form_window, width=60)
        price_entry.insert(0, self.selected_product.price)
        price_entry.grid(row=1, column=1, padx=10, pady=5)

        tk.Label(form_window, text="Description:").grid(row=2, column=0, padx=10, pady=5)
        description_entry = tk.Text(form_window, width=45, height=4)
        description_entry.insert("1.0", self.selected_product.description)
        description_entry.grid(row=2, column=1, padx=10, pady=5)

        tk.Label(form_window, text="Image Path:").grid(row=3, column=0, padx=10, pady=5)
        image_entry = Entry(form_window, width=60)
        image_entry.insert(0, self.selected_product.image_path)
        image_entry.grid(row=3, column=1, padx=10, pady=5)

        def browse_image():
            filename = filedialog.askopenfilename(filetypes=[("Image Files", "*.jpg;*.jpeg;*.png")])
            if filename:
                image_entry.delete(0, tk.END)
                image_entry.insert(0, filename)

        browse_button = Button(form_window, text="Browse", command=browse_image)
        browse_button.grid(row=3, column=2, padx=10, pady=5)

        def update_product_in_inventory():
            name = name_entry.get()
            price = price_entry.get()
            description = description_entry.get("1.0",'end-1c')
            image_path = image_entry.get()

            try:
                price = float(price)  # Chuyển đổi giá thành số
                if name and price >= 0 and description and image_path:
                    self.selected_product.name = name
                    self.selected_product.price = price
                    self.selected_product.description = description
                    self.selected_product.image_path = image_path
                    
                    index = self.product_listbox.curselection()[0]
                    self.product_listbox.delete(index)
                    self.product_listbox.insert(index, name)
                    form_window.destroy()
                else:
                    messagebox.showerror("Error", "Please fill all fields correctly.")
            except ValueError:
                messagebox.showerror("Error", "Price must be a number.")

        update_button = tk.Button(form_window, text="Update Product", command=update_product_in_inventory)
        update_button.grid(row=4, column=0, columnspan=3, pady=10)

    def show_details(self):
        if self.selected_product:
            messagebox.showinfo("Product Details", 
                f"Name: {self.selected_product.name}\n"
                f"Price: ${self.selected_product.price:.2f}\n"
                f"Description: {self.selected_product.description}")

    def delete_product(self):
        if self.selected_product:
            index = self.product_listbox.curselection()[0]
            self.products.pop(index)
            self.product_listbox.delete(index)
            self.selected_product = None
            self.update_details()

if __name__ == "__main__":
    root = tk.Tk()
    root.geometry("800x500")  # Kích thước cửa sổ
    app = InventoryApp(root)
    root.mainloop()