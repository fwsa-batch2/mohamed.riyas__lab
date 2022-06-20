class Filehandling
    def createfile
        creating_file = File.new("sample.txt", "w+")
        creating_file.syswrite("hi")
        creating_file.close()
    end
end

ob = Filehandling.new
ob.createfile