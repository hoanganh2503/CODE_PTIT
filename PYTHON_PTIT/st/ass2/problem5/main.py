import tkinter as tk
import view

list_products = []

if __name__ == "__main__":
    root = tk.Tk()
    root.geometry("800x500")
    app = view.InventoryApp(root)   
    root.mainloop()