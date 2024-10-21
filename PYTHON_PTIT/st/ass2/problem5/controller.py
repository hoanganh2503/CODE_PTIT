from model import Product
from main import list_products
class InventoryController:
    def create_product(name, price, description, image_path):
        try:
            price = float(price)
            if name and price > 0 and description and image_path:
                list_products.append(Product(name, price, description, image_path))
                return True
            else:
                return "Please fill all fields correctly."
        except ValueError:
            return "Price must be a number."
        
    def get_current_product(id):
        try:
            return list_products[id]
        except IndexError:
            return "Product not found."

    def update_product(index, name, price, description, image_path):
        try:
            price = float(price)
            if name and price > 0 and description and image_path:
                list_products[index].name = name
                list_products[index].price = price
                list_products[index].description = description
                list_products[index].image_path = image_path
                return True
            else:
                return "Please fill all fields correctly."
        except ValueError:
            return "Price must be a number."

    def delete_product(index):
        try:
            list_products.pop(index)
            return True
        except IndexError:
            return "Product not found."
