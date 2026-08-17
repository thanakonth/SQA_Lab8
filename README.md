# Lab Assignment #8 - Integration Testing
## รายละเอียดการแก้ไข

### 1. DistanceConverter
แก้การแปลง Inch → Meter จาก multiplier = 2.54/1000 เป็น multiplier = 2.54/100 เนื่องจาก 1 inch = 0.0254 meter

### 2.TemperatureConverter
แก้ปัญหา Integer Division โดยเปลี่ยนค่าที่ใช้หารจาก int เป็น double เช่นการใช้ 9/5 ซึ่งให้ค่า 1 แทนที่จะเป็น 1.8

### 3.WeightConverter

แก้การแปลง Kilogram → Gram จาก multiplier = 1.0/1000 เป็น multiplier = 1000

แก้แก้การแปลง Gram → Kilogram จาก multiplier = 1000 เป็น multiplier = 1.0/1000

แก้ชื่อหน่วย Ounce ที่เขียนผิดเป็น Once

### 4.UniversalConverter
เดิม UniversalConverter สร้าง Converter ภายใน convert() เปลี่ยนเป็นการประกาศ Dependency เป็นตัวแปรของ Class และรับ Dependency ผ่าน Constructor
ทำให้สามารถ Dependency Injection ส่ง Stub เข้าไปแทน Converter จริงได้
