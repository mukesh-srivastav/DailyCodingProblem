def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair

def car(f) : 
	def front(a,b) : 
		return a
	return f(front)

def cdr(f) : 
	def back(a,b) : 
		return b
	return f(back)

def back(a,b) : 
    return b
print(cons(3,4)(back))
print(car(cons(3,4)))
print(cdr(cons(3,4)))

