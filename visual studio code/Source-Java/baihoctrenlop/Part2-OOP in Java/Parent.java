class Parent {
		private final void method() {}
}
class Child extends Parent {
	void method() throws Exception {} // throw new Exceptions
}
/*
 In this case the sub class doesn't even know about the method in
 the super class because its private, so its defining
 a new one of its own that doesnt have to follow overriding rules. 
 */