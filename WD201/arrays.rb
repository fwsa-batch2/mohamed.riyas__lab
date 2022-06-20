# problem 1

names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]
new_names = []
for i in 0...names.length do
    new_names.push(names[i].join(" "))
end
p new_names

# problem 2
books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]

for j in 0...books.length do
    for k in 0...authors.length do
        if j == k
            puts "#{books[j]} is written by #{authors[k]}"
        end
    end
end

# problem 3
arr1 = []
todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"]
]
for i in 0...todos.length do
    arr1.push(todos[i].last)
end
uniq_arr = arr1.uniq
p uniq_arr

for j in 0...uniq_arr.length do
    print uniq_arr[j]
    puts (":")
    for k in 0...todos.length do
        if uniq_arr[j] == todos[k][1] 
            puts todos[k][0]
        end
    end
end