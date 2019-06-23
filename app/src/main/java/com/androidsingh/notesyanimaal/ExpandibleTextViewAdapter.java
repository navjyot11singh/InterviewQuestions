package com.androidsingh.notesyanimaal;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ConcurrentModificationException;

public class ExpandibleTextViewAdapter extends BaseExpandableListAdapter {

    Context context;

    String[] questions={
            "What is Android?",
            "What is Android SDK?",
            " Name the languages supported for Android development.",
            "Explain briefly – what is meant by Activities?",
            "What is meant by Services?",
            "What is an Intent?",
            "Explain Implicit and Explicit Intents.",
            "What is .apk extension in Android?",
            "What is the database used for Android platform",
            " What is ANR in Android?",
            "What is ADB?",
            "What is ActivityCreator?",
            "What is AIDL?",
            "Explain AndroidManifest.xml file and why do you need this?",
            "How do you find memory leaks in the mobile app on Android platform?",
            "Define Android toast",
            "Explain the use of 'bundle' in android?",
            "What is a content provider?",
            "What is fragment?",
            "What is NDK?",
            "What is ANR?",
            "What is ADT in Android?",
            "What is View Group in Android?",
            "What is the Adapter in Android?",
            "What is nine-patch images tool in Android?",
            "What is a singleton class in Android?",
            "What do you mean by a drawable folder in Android?",
            " What are the different kinds of context in Android?",
            "What are the containers?",
            "What is the difference between Service and Thread?"

    };

    String[][] answer={{
            "Android is an open source operating system and is mainly popular for Smartphones and Tablets.\n" +
                    "\n" +
                    "This operating system is Linux Kernel based. Using Android operating system, the developer develops the functions or programs which can perform basic as well as the advanced type of operations on the Smartphone."},{
            "To develop a mobile application, Android developers require some tools and this requirement is satisfied by “Android SDK” which is a set of tools that are used for developing or writing apps.\n" +
                    "\n" +
                    "It has a Graphical User Interface which emulates the Android environment. This emulator acts as an actual mobile device on which the developers write their code and then debug/test the same code to check if anything is wrong."},{
            "Java is the widely used language for Android development.\n" +
                    "\n" +
                    "It also supports C/C++ and when used with Android SDK, it improves the performance speed too."},{
            "Activities are the part of the mobile app which the user can see and interact with.\n" +
                    "\n" +
                    "For Example, if you open an SMS app which has multiple activities like create new SMS, add a contact from the address book, write the content in the SMS body, send SMS to the selected contact, etc."},{
            "Service is an Android component which runs in the background and acts independently. It does not provide any user interface."},{
            "Android has an Intent class when the user has to navigate from one Activity to another. Intent displays notifications from the device to the user and then the user can respond to the notification if required."},{
            " Implicit Intent calls the system components while explicit Intents invoke the Activity class"},{
            "It is a default file format that is used by Android Operating System. Application Package Kit (APK) is used for installation of mobile apps. The .apk contains resource file, certificate, manifest file and other code."},{
            "SQLite is the database that is used for Android platform. It is an open-source, serverless database."},{
            "ANR stands for Application Not Responding. It is a notification or pop-up displayed by the Android platform whenever the application is performing too many functions at a time and if it is suddenly not responding for a long time to the user action."},{
            "Android Debug Bridge (ADB) is a command line tool which performs shell commands.\n" +
                    "\n" +
                    "ADB is used for direct communication between the emulator ports. It gives the direct control of the communication between the emulator instances to the developer."},{
            "ActivityCreator is a batch file and shell script which was used to create a new Android project. It is now replaced by “Create New Project” in Android SDK"},{
            "In the Android platform, there are remote methods which facilitate the use of methods from one program to another. To create and implement the remote methods the first step is to define communication interface in AIDL.\n" +
                    "\n" +
                    "AIDL stands for Android Interface Definition Language. It facilitates the communication between the client and service. It also communicates the information through inter-process communication."},{
            "Every application must have AndroidManifest.xml file in the root directory. It contains the information about your app and provides the same to the Android system.\n" +
                    "\n" +
                    "The information includes the package name, Android components such as Activity, Services, Broadcast Receivers, Content Providers, etc. Every Android system must have this information before running any app code."},{
            "Android Studio is using Android Device Manager (ADM), this ADM is used to detect the memory leaks in the Android platform.\n" +
                    "\n" +
                    "When you open ADM in the Android Studio then on the left-hand side of the ADM, you will find your device or emulator in which a heap sign will be displayed. When you are running any mobile app then you will see the heap size, memory analysis and other statistics displayed on it."},{
            "An android toast provides feedback to the users about the operation being performed by them. It displays the message regarding the status of operation initiated by the user."},{
            "We use bundles to pass the required data to various subfolders."},{
            "A content provider is used to share information between Android applications."},{
            "The fragment is a part of Activity by which we can display multiple screens on one activity."},{
            "NDK stands for Native Development Kit. By using NDK, you can develop a part of an app using native language such as C/C++ to boost the performance."},{
            "ANR stands for Application Not Responding. It is a dialog box that appears if the application is no longer responding."},{
            "ADT stands for Android Development Tool. It is used to develop the applications and test the applications."},{
            "View Group is a collection of views and other child views. It is an invisible part and the base class for layouts."},{
            "An adapter is used to create a child view to present the parent view items."},{
            "We can change bitmap images into nine sections with four corners, four edges, and an axis."},{
            "A singleton class is a class which can create only an object that can be shared by all other classes."},{
            "In Android, a drawable folder is compiled a visual resource that can use as a background, banners, icons, splash screen, etc"},{
            "Context defines the current state of an App. Context provides access to creating new activity instance, access databases, start a service, etc. There is a base class ApplicationContext, and subclasses for components: Activity, Service."},{
            "Containers, holds objects and widgets together, depending on which specific items are needed and in what particular arrangement that is wanted. Containers may hold labels, fields, buttons, or even child containers, as examples."},{
            "Service is like an Activity but has no interface. For example, for fetching information on weather, blank activity will not be created. Here Service will be used. It is also known as Background Service because it performs tasks in background.\n" +
                    "\n" +
                    "A Thread is a concurrent unit of execution. Take note that the UI cannot be updated from a Thread. For this a Handler must be used."}


    };

    public ExpandibleTextViewAdapter(Context context) {
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
