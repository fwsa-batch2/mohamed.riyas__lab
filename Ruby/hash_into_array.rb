# class Practice
#     def summa
#         ar = Array.new
#         for i in 0..2 do
#             name = gets.chomp
#             age = gets.chomp.to_i
#             aswath = {"name" => name,"age" => age}
#             ar.push(aswath)
#         end
#         puts ar
#     end
# end

# ob = Practice.new
# ob.summa

class Animal
    attr_accessor :name
    def initialize(name,a)
        @name = name
    end
end

class GoodDog < Animal
    attr_accessor :color

    def initialize(color,a,b)
        super(color,a)
        @color = color
    end
end

bruno = GoodDog.new("brown") 
puts bruno.name
puts bruno.color
