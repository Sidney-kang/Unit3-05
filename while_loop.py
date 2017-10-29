# Created by : Sidney Kang
# Created on : 15 Oct. 2017
# Created for : ICS3UR
# Daily Assignment - Unit3-05
# This program displays a while loop program

import ui

def calculate_factorial_touch_up_inside(sender):
    
    #variables
    counter = 1
    current_factorial_value = 1
    
    #input 
    user_input = int(view['user_input_textbox'].text)
   
    #process 
    if user_input < 0:
    	 #output
       view['count_label'].text = "Please enter a non negative value."
       #https://stackoverflow.com/questions/21696310/what-does-return-mean-in-python
       return
       
    while counter <= user_input:
          current_factorial_value = counter * current_factorial_value      
          counter = counter + 1   
    #output          
    view['count_label'].text = "The factorial is: " + str(current_factorial_value)

view = ui.load_view()
view.present('sheet')
