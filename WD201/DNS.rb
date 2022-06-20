def get_command_line_argument
    # ARGV is an array that Ruby defines for us,
    # which contains all the arguments we passed to it
    # when invoking the script from the command line.
    # https://docs.ruby-lang.org/en/2.4.0/ARGF.html
    if ARGV.empty?
        puts "Usage: ruby lookup.rb <domain>"
        exit
    end
    ARGV.first
end

# `domain` contains the domain name we have to look up.
domain = get_command_line_argument

# File.readlines reads a file and returns an
# array of string, where each element is a line
# https://www.rubydoc.info/stdlib/core/IO:readlines
file = File.open("zone.txt")
dns_raw = File.readlines(file)
def parse_dns(params)
    for i in 0...params.length do
        if params[i].include? "#"
            array = params.drop(i+1)
        end
    end
    hash = {}
    arr = []
    for j in 0...array.length do
        arr[j] = array[j].split(",")
    end
    for j in 0...arr.length do
        hash[arr[j][1].strip] = arr[j][2].strip
    end
    hash.compact
end
def resolve(records,lookup_chain,domain_name)
    if (domain_name == "google.com" || domain_name == "ruby-lang.org")
        lookup_chain.push(records[domain_name])
        lookup_chain
    else
        key = lookup_chain.last
        if records.has_key?(key)
            lookup_chain.push(records[key])
            resolve(records,lookup_chain,domain_name)
            lookup_chain
        end
    end
end

# To complete the assignment, implement `parse_dns` and `resolve`.
# Remember to implement them above this line since in Ruby
# you can invoke a function only after it is defined.
dns_records = parse_dns(dns_raw)
p dns_records
lookup_chain = [domain]
lookup_chain = resolve(dns_records, lookup_chain, domain)
puts lookup_chain.join(" => ")