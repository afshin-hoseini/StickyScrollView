# StickyScrollView
It's a simple scroll view that helps you create a header that can stick to top of the scroll view.

# How to import to your project
1- Simply copy **stickyscrollviewlib** folder to your project folder, beside the **app** folder.

2- Copy the following compile dependency in *dependencies* block of your *build.gradle* (which is related to your *app* module).

```
compile project(':stickyscrollviewlib')
```

# How to use

To use sticky scroll view in your application, you should add the element to you layout xml file, like this:

```
<ir.afshin.stickyscrollviewlib.StickyScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        
</ir.afshin.stickyscrollviewlib.StickyScrollView>
```

As like as simple scrollView, stiky scroll view takes one child to scroll:

```
<ir.afshin.stickyscrollviewlib.StickyScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">
            
            
        <LinearLayout>
        
</ir.afshin.stickyscrollviewlib.StickyScrollView>
```
At last if you desire to have an sticky part inside the linearLayout, you can do like this:

```
<ir.afshin.stickyscrollviewlib.StickyScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">
            
            <!-- Some views here -->
            
            <!-- This sticky header element will stick to top of scrollView while scrolling. JUST TRUST ME! :| -->
            
            <ir.afshin.stickyscrollviewlib.StickyHeader
                android:layout_width="match_parent"
                android:layout_height="wrap_content">

                <View
                    android:layout_width="match_parent"
                    android:layout_height="100dp"
                    android:background="#00ff00"/>

            </ir.afshin.stickyscrollviewlib.StickyHeader>
            
            
            <!-- Some views here -->
            
        <LinearLayout>
        
</ir.afshin.stickyscrollviewlib.StickyScrollView>
```

#Issues
Please report issues.
