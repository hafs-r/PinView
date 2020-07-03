# PinView
**PinView** is a custom UI control which is configurable by passing different attributes available, it is extended from **AppCompatEditText**.

---------------------------------------------
![Screenshot](screenshots/pinview_widget.png)
---------------------------------------------
**It can be used in xml layout as below**

```
    <com.apptualizer.pinview.PinView
        android:id="@+id/pin_view_line"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:background="@color/colorPrimaryDark"
        android:focusableInTouchMode="true"
        android:inputType="number"
        android:padding="4dp"
        android:text="1"
        android:textSize="20sp"
        android:textColor="@android:color/white"
        android:visibility="visible"
        app:layout_constraintVertical_bias=".2"
        app:borderColor="@android:color/white"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:pinLength="6"
        app:viewType="line"></com.apptualizer.pinview.PinView>
 
```

**Properties added in the extended PinView are listed below**

    - viewType : Use this property to configure shape of each char, There are 
                multiple container type available as listed below
                
                 - line
                 - rectangle
                 - circle 

    - pinLength : Use this property to configure code length expected
    - mask : Use this property to enable mask for each char
    - borderColor : Use this property to configure color of border
    - borderThickness : Use this property to configure thickness of border lines
    - backgroundColor : Use this property to configure filled background color




