use "collections"

actor Main
  new create(env: Env) =>
    for i in Range[F32](1, 5) do
        let r = Rectangle(i, i + 2)
        let s = "Width and height: " + r.dimensions() +
            "\nCircumference: " + r.circumference().string() +
            "\nArea: " + r.area().string() + "\n"
      env.out.print(s)
    end

class Rectangle
  let _width: F32
  let _height: F32

  new create(width: F32, height: F32) =>
    _width = width
    _height = height

  fun dimensions(): String => _width.string() + " " + _height.string()

  fun circumference(): F32 => 2 * (_width + _height)

  fun area(): F32 => _width * _height
