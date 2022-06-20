class Loops
    # iterating hash datatype using for loop
    def for_loop
        $emp_details = {"name" => "Riyas", "age" => "19", "Native" => "tirunelveli"}
        puts "Iterating through for loop"
        for i in 0...$emp_details.length do
            puts "the values is #{$emp_details.values[i]}"
        end
    end
    # iterating hash datatype using for each loop
    def for_each_loop
        puts " "
        puts "Iterating through for each"
        $emp_details.each do |keys,values|
            puts "the #{keys} of the employee is #{values}"
        end
    end
    def while_loop
        x = 0
        puts " "
        puts "Iterating through while loop"
        while x < $emp_details.length do 
            puts "#{$emp_details.keys[x]} of the employee is #{$emp_details.values[x]}"
            x+=1
        end
        puts "ended"
    end
    def do_while_loop
        x = 0
        loop do
            if (x < $emp_details.length)
                puts "#{$emp_details.keys[x]} of the employee is #{$emp_details.values[x]}"
                x+=1
            else
                break
            end
        end
    end
end

obj = Loops.new
obj.for_loop
obj.for_each_loop
obj.while_loop
obj.do_while_loop