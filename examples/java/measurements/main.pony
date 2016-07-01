use "collections"

actor Main
  new create(env: Env) =>
    for i in Range[I32](1, 5) do
        let r = Rectangle(i, i + 2)
        env.out.print("Width and height: " + r.dimensions() +
            "\nCircumference: " + r.circumference().string() +
            "\nArea: " + r.area().string() + "\n")
    end

class Rectangle
  let _width: I32
  let _height: I32

  new create(width: I32, height: I32) =>
    _width = width
    _height = height

  fun dimensions(): String => _width.string() + " " + _height.string()

  fun circumference(): I32 => 2 * (_width + _height)

  fun area(): I32 => _width * _height
