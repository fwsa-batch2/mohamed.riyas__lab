class HELLOWORLD
    def set_name(name)
        @@name = name
    end

    def get_name
        @@name
    end

    def set_age(age)
        @age = age
    end

    def get_age
        @age
    end
end

obj = HELLOWORLD.new
obj.set_name("ismail")
obj.set_age(21)
puts obj.get_name
puts obj.get_age

ob = HELLOWORLD.new
ob.set_age(22)
puts ob.get_name
puts ob.get_age