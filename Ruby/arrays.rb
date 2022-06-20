class Array
    def string_to_array
        name = "Mohamed"
        arr = []
        for i in 0...name.length do
            arr.push(name[i])
        end
        p arr
    end
    def find_a_element
        name = [1,2,3,4]
        riyas = name.find {|n| n%2==0}
        p riyas
    end
    def problem_1
        names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]
        new_names = []
        for i in 0...names.length do
            new_names.push(names[i])
        end
        for j in 0...new_names.length do
            p new_names[j].join(" ")
        end
    end
    def problem_2
        books = ["Design as Art", "Anathem", "Shogun"]
        authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
        books_and_author = {}
        for i in 0...books.length do
            for j in 0...authors.length do
                if (i == j)
                    books_and_author.store(books[i],authors[j])
                end
            end
        end
        puts books_and_author
    end
end
obj = Array.new
# obj.string_to_array
# obj.find_a_element
# obj.problem_1
obj.problem_2