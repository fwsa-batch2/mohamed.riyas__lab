# books = ["a","b","c"]
# author = ["ash","riyas","mus"]
# hash = {}


# for i in 0...books.length do 
#     for j in 0...author.length do
#         if i == j
#             hash.store(books[i],author[j])
#         end
#     end
# end
# puts hash

# nums = [2, 4, 200, 400]
# new_nums = nums.map {|number| number * 125 }
# new_nums.each {|n| puts n }

class Department
    def initialize(name, classrooms_count)
        @name = name
        @classrooms_count = classrooms_count
        @teachers = []
    end

    def add_teacher(teacher)
        @teachers.push(teacher)
    end

    def rooms_info
        "Classrooms count: #{@classrooms_count}"
    end

    def teachers_info
        "Number of teachers: #{@teachers.length}"
    end

    def department_info
        "Department: #{@name}, #{rooms_info}, #{teachers_info}"
    end
end

class Computer_department < Department  
    def initialize(name,classrooms_count,lab_count,conf_room_count)
        super(name,classrooms_count)
        @lab_count = lab_count
        @conf_room_count = conf_room_count
    end
    def get_lab_count
        @lab_count
    end
    def comp_dep_info
        @classrooms_count
    end
end
ob = Computer_department.new("computer",10,2,4)
puts ob.comp_dep_info

