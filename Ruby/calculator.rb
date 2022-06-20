class Calculator
    def add(num1,num2)
        puts "The value of addition is : #{num1 + num2}"
    end
    def sub(num1,num2)
        puts "The value of subtraction is : #{num1 - num2}"
    end
    def mul(num1, num2)
        puts "The value of multiplication is : #{num1 * num2}"
    end
    def div(num1, num2)
        puts "The value of division is : #{num1 / num2}"
    end
end
number1 = gets.chomp.to_f
number2 = gets.chomp.to_f
obj = Calculator.new
obj.add(number1,number2)
obj.sub(number1,number2)
obj.mul(number1,number2)
obj.div(number1,number2)