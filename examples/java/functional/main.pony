actor Main
  new create(env : Env) =>
    env.out.print(compare(2,1))

  fun compare(a: I64, b: I64): String =>
    match (a, b)
    | if a > b => "a is bigger than b"
    | if a < b => "b is bigger than a"
    else "a and b are the same"
    end
