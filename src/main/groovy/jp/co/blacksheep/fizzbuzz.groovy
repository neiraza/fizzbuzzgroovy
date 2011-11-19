package src.main.groovy.jp.co.blacksheep

class FizzBuzz {
	void fizzbuzz1(){
		(1..100).each{println(it%3==0?it%5==0?'FizzBuzz':'Fizz':it%5==0?'Buzz':it)} 
	}
	void fizzbuzzSample(){
		100.times{println('Fizz'*(it%3/2)+'Buzz'*(it%5/4)?:++it)}
	}
}

def foo = new FizzBuzz()
//foo.fizzbuzz1()
foo.fizzbuzzSample()
