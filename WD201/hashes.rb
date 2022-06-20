# problem 1
books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
hash = {}
for i in 0...books.length do
    for j in 0...authors.length do
        if i == j
            hash.store(books[i],authors[j])
        end
    end
end
puts hash

# problem 2
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
temp_hash = {}

for j in 0...uniq_arr.length do
     uniq_arr_each = uniq_arr[j]
     arr2 = []
    for k in 0...todos.length do
        if uniq_arr[j] == todos[k][1] 
            arr2.push(todos[k][0])
        end
    end
    temp_hash.store(uniq_arr_each.to_sym,arr2)
end
p temp_hash