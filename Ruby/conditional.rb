
puts "enter the num"
def conditional
    age = gets.chomp.to_i
    if age > 18
        puts "can play the game"
  elsif 
      age < 18
      puts "cannot play the game"
  else
    age = 18
    puts "hello"    
    end
end

conditional