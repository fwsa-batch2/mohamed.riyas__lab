class Animal 
    def get_name
        @name = "annamalai"
    end

    def chage_name
        @name
    end

    def list_name
        @name
    end
end

dog = Animal.new 
puts dog.chage_name
puts dog.list_name