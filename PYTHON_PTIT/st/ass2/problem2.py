restaurants = {
    "Joe's Gourmet Burgers":{
        "Vegetarian": False,
        "Vegan": False, 
        "Gluten-Free": False
    },
    "Main Street Pizza Company": {
        "Vegetarian": True, 
        "Vegan": False,
         "Gluten-Free": True
    },
    "Corner Café": {
        "Vegetarian": True, 
        "Vegan": True, 
        "Gluten-Free": True
    },
    "Mama's Fine Italian": {
        "Vegetarian": True, 
        "Vegan": False,
        "Gluten-Free": False
    },
    "The Chef's Kitchen": {
        "Vegetarian": True, 
        "Vegan": True, 
        "Gluten-Free": True
    }
}

def get_user_choice(prompt):
    while True:
        user_input = input(prompt).strip().lower()
        if user_input in ['yes', 'no']:
            return user_input == 'yes'
        else:
            print("Please enter 'yes' or 'no'.")

is_vegetarian = get_user_choice("Is anyone in your party a vegetarian? ")
is_vegan = get_user_choice("Is anyone in your party a vegan? ")
is_gluten_free = get_user_choice("Is anyone in your party gluten-free? ")


allowed_restaurants = []    
for restaurant, info in restaurants.items():
    if (not is_vegetarian or info["Vegetarian"]) and (not is_vegan or info["Vegan"]) and (not is_gluten_free or info["Gluten-Free"]):
        allowed_restaurants.append(restaurant)

print("Here are your restaurant choices:")
for restaurant in allowed_restaurants:
    print(f"    {restaurant}")