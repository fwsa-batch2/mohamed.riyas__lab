# class RectangleArea
#     def areaFormula
#         length = gets.chomp.to_i
#         breadth = gets.chomp.to_i
#         formula = length * breadth
#         puts "Area of the rectangle is : #{formula}"
#     end
# end

# obj = RectangleArea.new
# obj.areaFormula
# class NEW_CLASS
#     @@const_name = "meenu"
#     @name = "surya"
#    def set_name(new_name)
#     @name = new_name
#    end
#    def get_name
#      @name
#    end
#     def get_const_name
#         @@const_name
#     end
#     def set_const_name(new_name)
#         @@const_name = new_name
#     end
# end
# class_1 = NEW_CLASS.new
# class_1.set_const_name("aaa")
# puts class_1.get_const_name
# class_2 = NEW_CLASS.new
# puts class_2.get_const_name
# class_1.set_name("bbb")
# puts class_1.get_name
# puts class_2.get_name
class NEW_CLASS_1
    attr_accessor :cls1name
    attr_accessor :cls1constname
    @cls1name = 12
    @@cls1constname = 13
end
cls1 = NEW_CLASS_1.new
cls2 = NEW_CLASS_1.new
cls1.cls1name = "ccc"
puts cls1.cls1name
puts cls2.cls1name
cls1.cls1constname = "ddd"
puts cls1.cls1constname
puts cls2.cls1constname

# class Summa
#     @cls1name  = 10
#     def prasanna
#         puts @cls1name
#     end
# end
# cls_1 = Summa.new
# cls_1.prasanna









