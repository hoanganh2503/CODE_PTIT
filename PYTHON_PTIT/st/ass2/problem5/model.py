class Product:
    def __init__(self, name, price, description, image_path):
        self.__name = name
        self.__price = price
        self.__description = description
        self.__image_path = image_path

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, value):
        self.__name = value

    @property
    def price(self):
        return self.__price

    @price.setter
    def price(self, value):
        if value < 0:
            raise ValueError("Price cannot be negative")
        self.__price = value

    @property
    def description(self):
        return self.__description

    @description.setter
    def description(self, value):
        self.__description = value

    @property
    def image_path(self):
        return self.__image_path

    @image_path.setter
    def image_path(self, value):
        self.__image_path = value


class GeneralProduct(Product):
    pass

class Toy(Product):
    pass

class Electronic(Product):
    pass
