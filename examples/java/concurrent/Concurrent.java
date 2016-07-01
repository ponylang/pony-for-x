
actor Counter
  var _count: U32

  new create() =>
    _count = 0

  be inc() =>
    _count = _count + 1

  be show_and_reset(main: Main) =>
    main.display(_count)
    _count = 0

actor Main
  let _env: Env

  new create(env: Env) =>
    _env = env

    var count: U32 = try env.args(1).u32() else 10 end
    var counter = Counter

    for i in Range[U32](0, count) do
      counter.inc()
    end

    counter.show_and_reset(this)

    be display(result: U32) =>
      _env.out.print(result.string())
