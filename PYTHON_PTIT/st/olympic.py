
import turtle

tr = turtle.Turtle()
tr.pensize(5)

def draw(color, x, y):
    tr.color(color)
    tr.penup()
    tr.goto(x, y)
    tr.pendown()
    tr.circle(45)
draw("blue", -110, -25)
draw("black", 0, -25)
draw("red", 110, -25)
draw("yellow", -55, -75)
draw("green", 55, -75) 

tr.hideturtle()

turtle.done()