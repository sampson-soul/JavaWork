package part212;

abstract class MyGraphic {
	int width, height;
	float upwidth, r;
	float area, perimeter;
	final float PI = 3.14f;
}
class rectangle extends MyGraphic{
	void area(){
		area = width * height;
		perimeter = 2 * (width + height);
	}
}
class triangle extends MyGraphic{
	void area(){
		area = width * height / 2;
	}
}
class circle extends MyGraphic{
	void area(){
		area = PI * r * r;
		perimeter = 2 * PI * r;
	}
}
class oval extends MyGraphic{ //Õ÷‘≤
	void area(){
		area = PI * width * height / 4;
	}
}
class rhombus extends MyGraphic{ //¡‚–Œ
	void area(){
		area = width * height / 2;
	}
}
class trapezoid extends MyGraphic{ //Ã›–Œ
	void area(){
		area = (upwidth + width) * height / 2;
	}
}