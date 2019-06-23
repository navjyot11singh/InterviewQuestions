package com.androidsingh.notesyanimaal;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ConcurrentModificationException;

public class ExpandibleTextViewAdapterC extends BaseExpandableListAdapter {

    Context context;

    String[] questions={
                        "What are the Comments in C++?",
                        "Difference between Declaration and Definition of a variable.",
                        "Comment on Local and Global scope of a variable.",
                        "What is the precedence when there is a Global variable and a Local variable in the program with the same name?",
                        "When there is a Global variable and Local variable with the same name, how will you access the global variable?",
                        "What is a Constant?",
                        "How do you define/declare constants in C++?",
                        "State the difference between Pre and Post Increment/Decrement Operations.",
                        "What do you mean by ‘void’ return type?",
                        "Explain Pass by value and Pass by reference.",
                        "What is an Inline function in C++?",
                        "Why are arrays usually processed with for loop?",
                        "State the difference between delete and delete[].",
                        "What's the order in which the objects in an array are destructed?",
                        "What is a Reference Variable in C++?",
                        "Explain Mutable Storage class specifier.",
                        "What is the keyword auto for?",
                        "What is a Static Variable?",
                        "Explain Register Storage Specifier.",
                        "What is Namespace?",
                        "What is the use of ‘using' declaration?",
                        "What is Name Mangling?",
                        "What is a Default Constructor?",
                        "What is a Conversion Constructor?",
                        "What is an Explicit Constructor?",
                        "What is the role of Static keyword for a class member variable?",
                        "Explain the Static Member Function.",
                        "What is the difference between Method Overloading and Method Overriding in C++?",
                        "What are the benefits of Operator Overloading?",
                        "What is Inheritance?",
                        "What are the advantages of Inheritance?",
                        "What is a friend function?",
                        "What is a template?",
                        "Comment on C++ standard exceptions?",
                        "What is the block scope variable in C++?",
                        "What is the role of the file opening mode ios::trunk?"

    };

    String[][] answer={{
            "Comments in C++ are simply a piece of source code ignored by the compiler. They are only helpful for a programmer to add a description or additional information about their source code."},{
            " Declaration of a variable is merely specifying the data type of a variable and the variable name. As a result of the declaration, we merely tell the compiler to reserve the space for a variable in the memory according to the data type specified."},{
            "Local Scope: A variable is said to have a local scope or is local when it is declared inside a code block. The variable remains active only inside the block and is not accessible outside the code block.\n" +
                    "Global Scope: A variable has a global scope when it is accessible throughout the program. A global variable is declared on top of the program before all the function definitions."},{
            "Whenever there is a local variable with the same name as that of a global variable, the compiler gives precedence to the local variable."},{
            "When there are two variables with the same name but different scope, i.e. one is a local variable and the other is a global variable, the compiler will give preference to a local variable.\n" +
                    "\n" +
                    "In order to access the global variable, we make use of “scope resolution operator (::)”. Using this operator, we can access the value of the global variable."},{
            "A constant is an expression that has a fixed value. They can be divided into integer, decimal, floating point, character or string constants depending on their data type."},{
            "In C++, we can define our own constants using the #define preprocessor directive."},{
            "C++ allows two operators i.e ++ (increment) and –(decrement), that allow to add 1 to the existing value of a variable and subtract 1 from the variable respectively. These operators are in turn, called increment (++) and decrement (–)."},{
            "All functions should return a value as per the general syntax.\n" +
                    "\n" +
                    "However, in case, if we don't want a function to return any value, we use “void” to indicate that. This means that we use “void” to indicate that the function has no return value or it returns “void”."},{
            "While passing parameters to the function using “Pass by Value”, we pass a copy of the parameters to the function.\n" +
                    "\n" +
                    "Hence, whatever modifications are made to the parameters in the called function are not passed back to the calling function. Thus the variables in the calling function remain unchanged."},{
            "Inline function is a function that is compiled by the compiler as the point of calling the function and the code is substituted at that point. This makes compiling faster. This function is defined by prefixing the function prototype with the keyword “inline”.\n" +
                    "\n" +
                    "Such functions are advantageous only when the code of the inline function is small and simple. Although a function is defined as Inline, it is completely compiler dependent to evaluate it as inline or not."},{
            "Array uses the index to traverse each of its elements.\n" +
                    "\n" +
                    "If A is an array then each of its element is accessed as A[i]. Programmatically, all that is required for this to work is an iterative block with a loop variable i that serves as an index (counter) incrementing from 0 to A.length-1.\n" +
                    "\n" +
                    "This is exactly what a loop does and this is the reason why we process arrays using for loops"},{
            "“delete[]” is used to release the memory allocated to an array which was allocated using new[]. “delete” is used to release one chunk of memory which was allocated using new."},{
            "Objects in an array are destructed in the reverse order of construction: First constructed, last destructed"},{
            "A reference variable is an alias name for the existing variable. This means that both the variable name and the reference variable point to the same memory location. Hence, whenever the variable is updated, the reference is updated too."},{
            "The variable of a constant class object’s member cannot be changed. However, by declaring the variables as “mutable”, we can change the values of these variables."},{
            "By default, every local variable of the function is automatic i.e. auto. In the below function both the variables ‘i’ and ‘j’ are automatic variables."},{
            "A static variable is a local variable that retains its value across the function calls. Static variables are declared using the keyword “static”. Numeric variables which are static have the default value as zero."},{
            "“Register” variable should be used whenever the variable is used. When a variable is declared with a “register” specifier, then the compiler gives CPU register for its storage to speed up the lookup of the variable."},{
            "Namespaces allow us to group a set of global classes, objects and/or functions under a specific name"},{
            "Using declaration is used to refer a name from the namespace without the scope resolution operator."},{
            "C++ compiler encodes the parameter types with function/method into a unique name. This process is called name mangling. The inverse process is called demangling"},{
            "Default constructor is a constructor that either has no arguments or if there are any, then all of them are default arguments."},{
            "It is a constructor that accepts one argument of a different type. Conversion constructors are mainly used for converting from one type to another."},{
            "A conversion constructor is declared with the explicit keyword. The compiler does not use an explicit constructor to implement an implied conversion of types. Its purpose is reserved explicitly for construction."},{
            "Static member variable shares a common memory across all the objects created for the respective class. We need not refer to the static member variable using an object. However, it can be accessed using the class name itself."},{
            "A static member function can access only the static member variable of the class. Same as the static member variables, a static member function can also be accessed using the class name."},{
            "Method overloading is having functions with the same name but different argument list. This is a form of compile-time polymorphism.\n" +
                    "\n" +
                    "Method overriding comes into picture when we rewrite the method that is derived from a base class. Method overriding is used while dealing with run-time polymorphism or virtual functions."},{
            "By overloading standard operators on a class, we can extend the meaning of these operators, so that they can also operate on the other user-defined objects."},{
            "Inheritance is a process by which we can acquire the characteristics of an existing entity and form a new entity by adding more features to it."},{
            "Inheritance allows code re-usability, thereby saving time on code development.\n" +
                    "\n" +
                    "By inheriting, we make use of a bug-free high-quality software that reduces future problems."},{
            "C++ class does not allow its private and protected members to be accessed outside the class. But this rule can be violated by making use of the “Friend” function.\n" +
                    "\n" +
                    "As the name itself suggests, friend function is an external function which is a friend of the class. For friend function to access the private and protected methods of the class, we should have a prototype of the friend function with the keyword “friend” included inside the class."},{
            "Templates allow creating functions that are independent of data type (generic) and can take any data type as parameters and return value without having to overload the function with all the possible data types. Templates nearly fulfill the functionality of a macro."},{
            "C++ supports some standard exceptions that can be caught if we put the code inside the try block. These exceptions are a part of the base class “std:: exception”. This class is defined in the C++ header file <exception>"},{
            "A variable whose scope is applicable only within a block is said so. Also a variable in C++ can be declared anywhere within the block."},{
            "If the file already exists, its content will be truncated before opening the file"}



    };

    public ExpandibleTextViewAdapterC(Context context) {
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
