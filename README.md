# Java

⇒ 객채의, 객체에 의한, 객채를 위한 언어

# Java의 프로그램 실행

작성한 .java파일은 .class로 변환된다.

class파일이 실행되는 것.

따라서 파일명.Java와 메인 클래스의 이름은 동일해야 한다.

### 자바의 메모리 구조

Code, Heap, Stack으로 구성

Code

⇒ 메서드 영역이라고도 함 [test.java](http://test.java) → test.class로 컴파일→ JVM의 클래스 로더가 가 test.class파일을 실행하기위해 필요한 클래스파일을 메모리에 올림

Heap

⇒ new 명령어로 인스턴스를 생성하면 메모리의 힙 영역에 생성됨

다만, 클래스의 메서드는 컴파일시에 code영역에만 만들어지고, 이후에는 만들어지지 않음

따라서 클래스의 필드영역만 힙에 할당됨

Stack

⇒ 메서드 내에서 선언한 지역변수가 저장됨. 필드는 자동으로 초기화되지만, 지역변수는 자동으로 초기화 되지 않으므로 선언과 동시에 초기화를 해주어야 합니다.

지역변수는 메서드가 호출되어 실행될 때, 스택에 생성되며, 메서드가 종료될 때 스택에서 삭제된다.

<aside>
💡 자바 프로그램은 힙 메모리에 직접 접근할 수 없다. 직접 접근 가능한 메모리는 오직 스택뿐이다.

</aside>

```java
public void test(){
	Armor suit = new Armor();
}
```

1. 해당 코드에서 suit는 지역변수이다. 메서드가 실행될 때, 스택 메모리에 생성된다.
2. new Armor 힙 메모리에 Armor 인스턴스를 생성하고 new를 통해 메모리의 위치정보, 즉 참조 정보를 반환한다.

따라서 

```java
suit=null;
```

과 같이 사용하면, suit를 통해 데이터에 접근 할 수 없다.

# 클래스와 인스턴스

클래스는 틀이고, 인스턴스는 찍힌 상품이라고 생각하면 된다.

보통 클래스는 특별한 경우가 아니라면 파일단위로 하나씩 작성한다.

클래스의 기능은 인스턴스라는 객체를 만들어내는 것이다.

```java
ClassName instance1= new ClassName();
```

과 같은 형태로 인스턴스를 생성한다.

### 인스턴스 변수

클래스에 선언된 변수를 객체변수라고 한다. 객체 변수는 인스턴스가 생성되며, 인스턴스 변수로 변하며, 해당 변수에 접근하기 위해서는 인스턴스.인스턴스변수명과 같이 사용한다.

# 메서드

자바에서 함수는 메서드라고 한다.

클래스 내부의 함수를 메서드라고 하는데, 자바는 모두 클래스기반이기 때문이다.

### Main 메서드

```java
public class Helloworld{
	public static void main(String[] args){
		System.out.println("Hello World");
	}
}
```

public : 메서드의 접근 제어자로, 누구나 해당 메서드에 접근 가능하다는 뜻이다.

static : 메서드에 static이 지정된 경우, 해당 메서드는 인스턴스 생성 없이 실행할 수 있음을 의미한다.

void : 메서드의 리턴값이 없음을 의미한다.

String[] : 문자열 배열을 의미하는 자료형이다.

### 메서드 오버로딩

클래스의 메서드는 인자에 따라서 여러번 호출하여, 각각의 호출에 대한 경우의 수를 만족시킬 수 있다.

```java
class print{
	void print(int x){
		System.out.println(x);
	}
	void print(int[] x){
		String s="'
		for (int i=0; i<x.length; i++){
			for (int num : x){
				s=s+num;
			}
		}
		System.out.println(s);
	}
}
```

<aside>
💡 가변길이 인자
데이터 타입이 같은 여러개의 인자를 받는 경우
**데이터 타입 …변수명** 
의 형태를 통해 변수명에 해당하는 데이터타입의 배열로 인자를 받을 수있다.
**다만, 가변길이 인자는 인자의 마지막에 선언해야 하고, 한 번만 사용할 수 있다.**

</aside>

### 정적 멤버 선언(클래스 필드)

클래스의 모든 인스턴스가 공유하는 멤버 → 정적 멤버

정적멤버는 해당 클래스로 만든 모든 인스턴스가 공유하는 멤버이다.

정적멤버는 프로그램이 시작될 때 딱 한번 메모리의 코드 영역에 할당되며, 프로그램이 종료될때까지 유지되는 특징이 있다.

```java
static int total;
public static void print(){
}
static{
	System.out.println("hi");
}
```

정적필드는 클래스에 포함되어, 클래스와 생명주기가 같다. 클래스필드라고도 한다.

일반필드는 인스턴스에 포함되어, 인스턴스와 생명주기가 같다. 인스턴스필드라고도 한다.

클래스 필드를 사용할 때는 참조변수가 필요하지 않다. main() 메서드가 실행되기 전에 메모리에 할당되었으므로, 바로 사용할 수 있다. 클래스필드는 클래스명.필드명의 형태로 사용한다.

### 클래스 메서드

클래스 필드와 동일한 개념으로, 메서드일 뿐이다.

클래스명.메서드명의 형태로 사용한다.

정적 블록

⇒ main()메서드가 실행되기 전에 실행된다.

```java
static{
	System.out.println("hi");
}
```

위와 같이 선언하는 경우, hi가 제일 먼저 출력된다.

### 생성자

클래스 생성자는 클래스 명과 동일하게 선언하고, 메서드처럼 선언하되, 리턴 타입이 없다.

인자로는 클래스 내에서 입력받을 변수를 받아서, 입력받은 변수를 할당하여 인스턴스를 만들어 낸다.

접근제한자 클래스명(매개변수)

형태로 선언한다.

```java
class RealCalculator{
	int left;
	int right;
	RealCalculaotor(int left, int right){
		this.left=left;
		this.right=right;
	};
}
public class Main{
	public static void main(String[] args){
		RealCalculator cal=new RealCalculator(2,3);
	}
}
```

생성자는 일반 메서드처럼 호출할 수 없다. 생성자는 new Classname의 형태로 호출하며, 생성자도 오버로딩이 가능하다.

# this

⇒ 현재 실행중인 인스턴스의 주소값을 나타낸다.

this의 용도

1. 클래스 멤버를 가리킬 때
2. 생성자를 호출할 때
    
    <aside>
    💡 this();
    
    </aside>
    
3. 자신의 주솟값을 전달하고 싶을 때

this형태로 오버로딩하는 것이 코드를 작성하는데 유리하다.

다만 이렇게 생성자를 호출하는 것은 생성자 첫번째 줄에서만 가능하다. 

```java
public class Member{
	private String name;
	private int age;
	public Member(){
		this.name="guest";
		this.age=0;
	}
	public Member(String name){
		this.name=name;
		this.age=0;
	}
	public Member(String name, int age){
		this.name=name;
		this.age=age;
	}
```

를 this를 이용해 생성자를 호출하면 다음과 같이 고칠 수 있다.

```java
public class Member{
	private String name;
	private int age;
	public Member(){
		this("guest");
	}
	public Member(String name){
		this(name,0);
	}
	public Member(String name, int age){
		this.name=name;
		this.age=age;
	}

```

# 클래스 상속

클래스 형태를 상속할 수 있다.

상속형태

```java
public class Employee extends Person
```

### 메서드 오버라이딩

⇒ 상속받은 클래스의 메서드를 재정의하여 사용하는 기술

상속받은 클래스의 추가적인 필드가 생기고, 그것을 사용해야 하는데 기존의 메서드로는 불가능한 경우, 우리는 메서드 오버라이딩을 해야한다.

주의점

1. 메서드 오버라이딩은 상속한 메서드의 본문만 변경할 수 있다.
2. 메서드 오버라이딩은 상속한 메서드의 선언부를 변경할 수 없다.
3. 메서드 오버라이딩할떄 접근제한자는 부모의 메서드와 같거나 넓은범위로만 변경가능하다.
4. 프로그램 실행시 메서드 호출 우선순위는 오버라이딩한 메서드가 부모의 메서드보다 높다.