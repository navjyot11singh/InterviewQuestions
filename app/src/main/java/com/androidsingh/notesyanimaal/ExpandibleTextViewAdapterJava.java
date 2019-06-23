package com.androidsingh.notesyanimaal;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ConcurrentModificationException;

public class ExpandibleTextViewAdapterJava extends BaseExpandableListAdapter {

    Context context;

    String[] questions={
            "What is JAVA?",
            "What are the features in JAVA?",
            "How does Java enable high performance?",
            "What are the Java IDE’s?",
            "What do you mean by Constructor?",
            "What is meant by Local variable and Instance variable?",
            "What is a Class?",
            "What is an Object?",
            "What are the Oops concepts?",
            "What is Inheritance?",
            "What is Encapsulation?",
            "What is Polymorphism?",
            "What is meant by Method Overriding?",
            "What is meant by Overloading?",
            "What is meant by Abstract class?",
            "Explain about Map.",
            "What is mean by Exception?",
            "What are the different ways to handle exceptions?",
            "What are the Advantages of Exception handling?",
            "What are Exception handling keywords in Java?",
            "Explain about Exception Propagation.",
            "Explain about join () method.",
            "What does yield method of the Thread class do?",
            "Explain about wait () method",
            "What is Synchronization?",
            "What is the disadvantage of Synchronization?",
            "What is meant by Serialization?",
            "What is the purpose of a transient variable?",
            "What is the purpose of a Volatile Variable?",
            "What is SerialVersionUID?",
            "What is object cloning?",
            "What is Android?",
            "Can we override private methods in Java?",
            "What is “super” keyword in java?",
            "What is static variable in Java?",
            "How are Java objects stored in memory?",
            "What is a singleton class?",
            "What is the difference between continue and break statement?",
            "What is the difference between double and float variables in Java?",
            "What is Final Keyword in Java?",
            "What is ternary operator?",
            "How can you generate random numbers in Java?",
            "What's the base class in Java from which all classes are derived?",
            "What are Java Packages? What's the significance of packages?",
            "Can we declare a class as Abstract without having any abstract method?",
            "Why Strings in Java are called as Immutable?",
            "What is multi-threading?"
    };

    String[][] answer={{
            "Java is a high-level programming language and is platform independent.\n" +
                    "\n" +
                    "Java is a collection of objects. It was developed by Sun Microsystems. There are a lot of applications, websites and Games that are developed using Java."},{
            "Features of Java:\n" +
                    "\n" +
                    "Oops concepts\n" +
                    "Object-oriented\n" +
                    "Inheritance\n" +
                    "Encapsulation\n" +
                    "Polymorphism\n" +
                    "Abstraction\n" +
                    "Platform independent: A single program works on different platforms without any modification.\n" +
                    "High Performance: JIT (Just In Time compiler) enables high performance in Java. JIT converts the bytecode into machine language and then JVM starts the execution.\n" +
                    "Multi-threaded: A flow of execution is known as a Thread. JVM creates a thread which is called main thread. The user can create multiple threads by extending the thread class or by implementing Runnable interface."},{
            "Java uses Just In Time compiler to enable high performance. JIT is used to convert the instructions into bytecodes."},{
            "Eclipse and NetBeans are the IDE's of JAVA."},{
            " The points given below explain what a Constructor is in detail:\n" +
                    "\n" +
                    "When a new object is created in a program a constructor gets invoked corresponding to the class.\n" +
                    "The constructor is a method which has the same name as class name.\n" +
                    "If a user doesn’t create a constructor implicitly a default constructor will be created.\n" +
                    "The constructor can be overloaded.\n" +
                    "If the user created a constructor with a parameter then he should create another constructor explicitly without a parameter."},{
            "Local variables are defined in the method and scope of the variables that have existed inside the method itself.\n" +
                    "\n" +
                    "An instance variable is defined inside the class and outside the method and scope of the variables exist throughout the class."},{
            "All Java codes are defined in a class. A Class has variables and methods.\n" +
                    "\n" +
                    "Variables are attributes which define the state of a class.\n" +
                    "\n" +
                    "Methods are the place where the exact business logic has to be done. It contains a set of statements (or) instructions to satisfy the particular requirement."},{
            "An instance of a class is called object. The object has state and behavior.\n" +
                    "\n" +
                    "Whenever the JVM reads the “new()” keyword then it will create an instance of that class."},{
            "Oops concepts include:\n" +
                    "\n" +
                    "Inheritance\n" +
                    "Encapsulation\n" +
                    "Polymorphism\n" +
                    "Abstraction\n" +
                    "Interface"},{
            "Inheritance means one class can extend to another class. So that the codes can be reused from one class to another class.\n" +
                    "\n" +
                    "Existing class is known as Super class whereas the derived class is known as a sub class."},{
            "Purpose of Encapsulation:\n" +
                    "\n" +
                    "Protects the code from others.\n" +
                    "Code maintainability."},{
            "Polymorphism means many forms.\n" +
                    "\n" +
                    "A single object can refer the super class or sub-class depending on the reference type which is called polymorphism."},{
            "Method overriding happens if the sub class method satisfies the below conditions with the Super class method:\n" +
                    "\n" +
                    "Method name should be same\n" +
                    "Argument should be same\n" +
                    "Return type also should be same\n" +
                    "The key benefit of overriding is that the Sub class can provide some specific information about that sub class type than the super class."},{
            "Method overloading happens for different classes or within the same class.\n" +
                    "\n" +
                    "For method overloading, subclass method should satisfy the below conditions with the Super class method (or) methods in the same class itself:\n" +
                    "\n" +
                    "Same method name\n" +
                    "Different argument type\n" +
                    "May have different return types"},{
            "We can create the Abstract class by using “Abstract” keyword before the class name. An abstract class can have both “Abstract” methods and “Non-abstract” methods that are a concrete class."},{
            "Map cares about unique identifier. We can map a unique key to a specific value. It is a key/value pair. We can search a value, based on the key. Like set, Map also uses “equals ( )” method to determine whether two keys are same or different."},{
            "An Exception is a problem that can occur during the normal flow of an execution. A method can throw an exception when something wails at runtime. If that exception couldn’t be handled, then the execution gets terminated before it completes the task.\n" +
                    "\n" +
                    "If we handled the exception, then the normal flow gets continued. Exceptions are a subclass of java.lang.Exception."},{
            "Two different ways to handle exception are explained below:\n" +
                    "\n" +
                    "#1) Using try/catch:"+"\n"+"#2) By declaring throws keyword:"},{
            "Given below are the advantages:\n" +
                    "\n" +
                    "The normal flow of the execution won’t be terminated if exception got handled\n" +
                    "We can identify the problem by using catch declaration"},{
            "Given below are the two Exception Handling Keywords:\n" +
                    "\n" +
                    "try:\n" +
                    "\n" +
                    "When a risky code is surrounded by a try block. An exception occurring in the try block is caught by a catch block. Try can be followed either by catch (or) finally (or) both. But any one of the blocks is mandatory.\n" +
                    "\n" +
                    "catch:\n" +
                    "\n" +
                    "This is followed by try block. Exceptions are caught here.\n" +
                    "\n" +
                    "finally:\n" +
                    "\n" +
                    "This is followed either by try block (or) catch block. This block gets executed regardless of an exception. So generally clean up codes are provided here."},{
            " Exception is first thrown from the method which is at the top of the stack. If it doesn’t catch, then it pops up the method and moves to the previous method and so on until they are got.\n" +
                    "\n" +
                    "This is called Exception propagation."},{
            "Join () method is used to join one thread with the end of the currently running thread."},{
            "A yield () method moves the currently running thread to a  runnable state and allows the other threads for execution. So that equal priority threads have a chance to run. It is a static method. It doesn’t release any lock.\n" +
                    "\n" +
                    "Yield () method moves the thread back to the Runnable state only, and not the thread to sleep (), wait () (or) block"},{
            "wait () method is used to make the thread to wait in the waiting pool. When a wait () method is executed during a thread execution then immediately the thread gives up the lock on the object and goes to the waiting pool. Wait () method tells the thread to wait for a given amount of time.\n" +
                    "\n" +
                    "Then the thread will wake up after notify () (or) notify all () method is called.\n" +
                    "\n" +
                    "Wait() and the other above-mentioned methods do not give the lock on the object immediately until the currently executing thread completes the synchronized code. It is mostly used in synchronization."},{
            "Synchronization makes only one thread to access a block of code at a time. If multiple thread accesses the block of code, then there is a chance for inaccurate results at the end. To avoid this issue, we can provide synchronization for the sensitive block of codes."},{
            "Synchronization is not recommended to implement all the methods. Because if one thread accesses the synchronized code then the next thread should have to wait. So it makes slow performance on the other end."},{
            "Converting a file into a byte stream is known as Serialization. The objects in the file is converted to the bytes for security purposes. For this, we need to implement java.io.Serializable interface. It has no method to define.\n" +
                    "\n" +
                    "Variables that are marked as transient will not be a part of the serialization. So we can skip the serialization for the variables in the file by using a transient keyword."},{
            "Transient variables are not part of the serialization process. During deserialization, the transient variables values are set to default value. It is not used with static variables."},{
            "Volatile variable values are always read from the main memory and not from thread's cache memory. This is used mainly during synchronization. It is applicable only for variables."},{
            "Whenever an object is Serialized, the object is stamped with a version ID number for the object class. This ID is called the  SerialVersionUID. This is used during deserialization to verify that the sender and receiver that are compatible with the Serialization."},{
            "Object cloning means to create an exact copy of the original object. If a class needs to support cloning, it must implement java.lang.Cloneable interface and override clone() method from Object class"},{
            "No, a private method cannot be overridden since it is not visible from any other class. "},{
            "The super keyword in java is a reference variable that is used to refer parent class objects. The keyword “super” came into the picture with the concept of Inheritance. Whenever you create the instance of subclass, an instance of parent class is created implicitly i.e. referred by super reference variable"},{
            "The static keyword in java is used for memory management mainly. We can apply java static keyword with variables, methods, blocks and nested class. The static keyword belongs to the class than instance of the class."},{
            "In Java, all objects are dynamically allocated on Heap. This is different from C++ where objects can be allocated memory either on Stack or on Heap. In C++, when we allocate abject using new(), the object is allocated on Heap, otherwise on Stack if not global or static."},{
            "A singleton class in java can have only one instance and hence all its methods and variables belong to just one instance. Singleton class concept is useful for the situations when there is a need to limit the number of objects for a class."},{
            "break and continue are two important keywords used in Loops. When a break keyword is used in a loop, loop is broken instantly while when continue keyword is used, current iteration is broken and loop continues with next iteration."},{
            " In java, float takes 4 bytes in memory while Double takes 8 bytes in memory. Float is single precision floating point decimal number while Double is double precision decimal number."},{
            "In java, a constant is declared using the keyword Final. Value can be assigned only once and after assignment, value of a constant can't be changed."},{
            "Ternary operator , also called conditional operator is used to decide which value to assign to a variable based on a Boolean value evaluation"},{
            "Using Math.random() you can generate random numbers in the range greater than or equal to 0.1 and less than 1.0\n" +
                    "Using Random class in package java.util"},{
            " java.lang.object"},{
            "In Java, package is a collection of classes and interfaces which are bundled together as they are related to each other. Use of packages helps developers to modularize the code and group the code for proper re-use. Once code has been packaged in Packages, it can be imported in other classes and used."},{
            "Yes we can create an abstract class by using abstract keyword before class name even if it doesn't have any abstract method. However, if a class has even one abstract method, it must be declared as abstract otherwise it will give an error."},{
            "In java, string objects are called immutable as once value has been assigned to a string, it can't be changed and if changed, a new object is created."},{
            " Multi threading is a programming concept to run multiple tasks in a concurrent manner within a single program. Threads share same process stack and running in parallel. It helps in performance improvement of any program."}



    };

    public ExpandibleTextViewAdapterJava(Context context) {
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return questions.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return answer[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return questions[groupPosition] ;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return answer[groupPosition][childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String questionFaq =(String) getGroup(groupPosition);
        if (convertView==null){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_tittle,null);
        }

        TextView questionFaq2 =convertView.findViewById(R.id.listTittle);
        questionFaq2.setTypeface(null, Typeface.BOLD);
        questionFaq2.setText(questionFaq);
        return convertView;



    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String answerFaq =(String) getChild(groupPosition,childPosition);
        if (convertView==null){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.answer,null);
        }

        TextView answerFaq2 =convertView.findViewById(R.id.answerTextView);
        answerFaq2.setText(answerFaq);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

}
