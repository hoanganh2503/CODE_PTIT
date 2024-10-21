import turtle

def draw_circle(x, y, color):
    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()
    turtle.color(color)
    turtle.begin_fill()
    turtle.circle(10)
    turtle.end_fill()

def draw_rectangle(color, x, y, width, height, pensize = 1):
    turtle.pensize(pensize)
    turtle.penup()
    turtle.goto(x, y)
    turtle.pendown()
    turtle.fillcolor(color)
    turtle.begin_fill()
    for _ in range(2):
        turtle.forward(width)
        turtle.right(90)
        turtle.forward(height)
        turtle.right(90)
    turtle.end_fill()

def draw_traffic_light():
    draw_rectangle("white", -70, 130, 140, 240, 6)
    draw_rectangle("black", -60, 120, 120, 220)
    draw_circle(0, 80, "red")
    draw_circle(0, 0, "yellow")
    draw_circle(0, -80, "green")
    turtle.hideturtle()
    turtle.done()

draw_traffic_light()