
public class Animal{
 String name;
Animal(String name){
this.name=name;}
void speak(){
System.out.println(name+" makes a sound");}
public static void main(String[]args){
Animal a=new Animal("Generic");
Dog d= new Dog("Rex");
Cat c= new Cat("Tom");
a.speak();
d.speak();
c.speak();
}}

class Dog extends Animal{
Dog(String name){
super(name);}
@Override
void speak(){
System.out.println(name+" says Woof");}
}

class Cat extends Animal{
Cat(String name){
super(name);}
@Override
void speak(){
System.out.println(name+" says Meow");}
}
