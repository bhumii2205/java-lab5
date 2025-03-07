# **Shape Calculator**  
A **Java-based menu-driven program** that calculates the **area, perimeter, and volume** of various geometric shapes. The program follows **Object-Oriented Programming (OOP)** principles using **abstraction** and **interfaces**.

## **📌 Features**
- Supports **2D Shapes**: **Circle, Rectangle, Square**  
- Supports **3D Shapes**: **Sphere, Cylinder, Equilateral Pyramid (Square Base)**  
- Implements **abstraction** with the `Shape` class  
- Implements **interface-based polymorphism** using the `Volume` interface  
- Uses **a menu-driven approach** for user interaction  
- Follows **clean code principles** with modular functions  
- **Structured Git commits** for clarity  

---

## **📁 Project Structure**
```
ShapeCalculator/
│── src/
│   ├── Main.java                 # Menu-driven program
│   ├── Shape.java                 # Abstract class defining shapes
│   ├── Volume.java                # Interface for volume calculations
│   ├── Circle.java                # Circle implementation
│   ├── Rectangle.java             # Rectangle implementation
│   ├── Square.java                # Square implementation
│   ├── Sphere.java                # Sphere implementation (with volume)
│   ├── Cylinder.java              # Cylinder implementation (with volume)
│   ├── EquilateralPyramid.java    # Equilateral Pyramid implementation (with volume)
│── README.md                      # Documentation file
```

---

## **⚙️ How It Works**
1. **Compile the Java files**:
   ```sh
   javac src/*.java
   ```
2. **Run the program**:
   ```sh
   java src.Main
   ```
3. The program will **display a menu**:
   ```
   1. Circle
   2. Rectangle
   3. Square
   4. Sphere
   5. Cylinder
   6. Equilateral Pyramid
   7. Exit
   ```
4. Choose a shape and **enter required measurements**.  
5. The program **calculates and displays**:
   - **Area**
   - **Perimeter (if applicable)**
   - **Volume (for 3D shapes)**
6. Repeat the process or **exit the program**.

---

## **📜 Class and Method Overview**
### **🔹 1. Shape (Abstract Class)**
> **Abstract class** that defines the **base structure** for all shapes.
#### ✨ Methods:
- `Shape(String shapeName)`: Constructor to set the shape's name.  
- `calculateShape()`: **Abstract method** to calculate area.  
- `calculatePerimeter()`: **Abstract method** to calculate perimeter.

---

### **🔹 2. Volume (Interface)**
> **Interface** for 3D shapes that require volume calculations.
#### ✨ Method:
- `calculateVolume()`: **Abstract method** to calculate volume.

---

### **🔹 3. Implemented Shape Classes**
#### **🟠 Circle.java**
- Implements `calculateShape()` → Computes **area**.  
- Implements `calculatePerimeter()` → Computes **perimeter**.  

#### **🟦 Rectangle.java**
- Implements `calculateShape()` → Computes **area**.  
- Implements `calculatePerimeter()` → Computes **perimeter**.  

#### **🟨 Square.java**
- Implements `calculateShape()` → Computes **area**.  
- Implements `calculatePerimeter()` → Computes **perimeter**.  

#### **⚪ Sphere.java** (*Implements `Volume` Interface*)
- Implements `calculateShape()` → Computes **surface area**.  
- Implements `calculateVolume()` → Computes **volume**.  

#### **🟢 Cylinder.java** (*Implements `Volume` Interface*)
- Implements `calculateShape()` → Computes **surface area**.  
- Implements `calculateVolume()` → Computes **volume**.  

#### **🔺 EquilateralPyramid.java** (*Implements `Volume` Interface*)
- Implements `calculateShape()` → Computes **surface area**.  
- Implements `calculatePerimeter()` → Computes **base perimeter**.  
- Implements `calculateVolume()` → Computes **volume**.  

---

## **📌 Example Output**
```
Welcome to Shape Calculator!

Select a shape:
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Equilateral Pyramid
7. Exit

Enter your choice: 1
Enter the radius of the circle: 5
Area: 78.54
Perimeter: 31.42

Select a shape:
...
```
## **💡 Conclusion**
This **Shape Calculator** project is a **well-structured Java program** that efficiently calculates the **area, perimeter, and volume** of different shapes.  
It follows **OOP principles**, maintains **code modularity**, and ensures **scalability for future enhancements**. 🚀  

---
🔹 **Created by:** Bhoomika Kapde  
🔹 **PRN:** 23070126025  
🔹 **Batch:** 2023-27  

