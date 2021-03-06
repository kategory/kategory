package arrow.core.extensions.const.divide

import arrow.Kind
import arrow.core.Const
import arrow.core.Const.Companion
import arrow.core.ForConst
import arrow.core.Tuple10
import arrow.core.Tuple2
import arrow.core.Tuple3
import arrow.core.Tuple4
import arrow.core.Tuple5
import arrow.core.Tuple6
import arrow.core.Tuple7
import arrow.core.Tuple8
import arrow.core.Tuple9
import arrow.core.extensions.ConstDivideInstance
import arrow.typeclasses.Monoid

@JvmName("divide")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(MO,arg1) { a, b -> arg2(Tuple2(a,b)) }",
    "arrow.core.Tuple2"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, Z> divide(
  MO: Monoid<O>,
  arg0: Kind<Kind<ForConst, O>, A>,
  arg1: Kind<Kind<ForConst, O>, B>,
  arg2: Function1<Z, Tuple2<A, B>>
): Const<O, Z> = arrow.core.Const
  .divide<O>(MO)
  .divide<A, B, Z>(arg0, arg1, arg2) as arrow.core.Const<O, Z>

@JvmName("divide")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(MO,arg1, arg2) { a, b, c -> arg3(Tuple3(a, b, c)) }",
    "arrow.core.Tuple3"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, Z> divide(
  MO: Monoid<O>,
  arg0: Kind<Kind<ForConst, O>, A>,
  arg1: Kind<Kind<ForConst, O>, B>,
  arg2: Kind<Kind<ForConst, O>, C>,
  arg3: Function1<Z, Tuple3<A, B, C>>
): Const<O, Z> = arrow.core.Const
  .divide<O>(MO)
  .divide<A, B, C, Z>(arg0, arg1, arg2, arg3) as arrow.core.Const<O, Z>

@JvmName("divide")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(MO,arg1, arg2, arg3) { a, b, c, d -> arg4(Tuple4(a, b, c, d)) }",
    "arrow.core.Tuple4"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, Z> divide(
  MO: Monoid<O>,
  arg0: Kind<Kind<ForConst, O>, A>,
  arg1: Kind<Kind<ForConst, O>, B>,
  arg2: Kind<Kind<ForConst, O>, C>,
  arg3: Kind<Kind<ForConst, O>, D>,
  arg4: Function1<Z, Tuple4<A, B, C, D>>
): Const<O, Z> = arrow.core.Const
  .divide<O>(MO)
  .divide<A, B, C, D, Z>(arg0, arg1, arg2, arg3, arg4) as arrow.core.Const<O, Z>

@JvmName("divide")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(MO,arg1, arg2, arg3, arg4) { a, b, c, d, e -> arg5(Tuple5(a, b, c, d, e)) }",
    "arrow.core.Tuple5"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E, Z> divide(
  MO: Monoid<O>,
  arg0: Kind<Kind<ForConst, O>, A>,
  arg1: Kind<Kind<ForConst, O>, B>,
  arg2: Kind<Kind<ForConst, O>, C>,
  arg3: Kind<Kind<ForConst, O>, D>,
  arg4: Kind<Kind<ForConst, O>, E>,
  arg5: Function1<Z, Tuple5<A, B, C, D, E>>
): Const<O, Z> = arrow.core.Const
  .divide<O>(MO)
  .divide<A, B, C, D, E, Z>(arg0, arg1, arg2, arg3, arg4, arg5) as arrow.core.Const<O, Z>

@JvmName("divide")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(MO,arg1, arg2, arg3, arg4, arg5) { a, b, c, d, e, f -> arg6(Tuple6(a, b, c, d, e, f)) }",
    "arrow.core.Tuple6"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E, FF, Z> divide(
  MO: Monoid<O>,
  arg0: Kind<Kind<ForConst, O>, A>,
  arg1: Kind<Kind<ForConst, O>, B>,
  arg2: Kind<Kind<ForConst, O>, C>,
  arg3: Kind<Kind<ForConst, O>, D>,
  arg4: Kind<Kind<ForConst, O>, E>,
  arg5: Kind<Kind<ForConst, O>, FF>,
  arg6: Function1<Z, Tuple6<A, B, C, D, E, FF>>
): Const<O, Z> = arrow.core.Const
  .divide<O>(MO)
  .divide<A, B, C, D, E, FF, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as arrow.core.Const<O, Z>

@JvmName("divide")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(MO,arg1, arg2, arg3, arg4, arg5, arg6) { a, b, c, d, e, f, g -> arg7(Tuple7(a, b, c, d, e, f, g)) }",
    "arrow.core.Tuple7"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E, FF, G, Z> divide(
  MO: Monoid<O>,
  arg0: Kind<Kind<ForConst, O>, A>,
  arg1: Kind<Kind<ForConst, O>, B>,
  arg2: Kind<Kind<ForConst, O>, C>,
  arg3: Kind<Kind<ForConst, O>, D>,
  arg4: Kind<Kind<ForConst, O>, E>,
  arg5: Kind<Kind<ForConst, O>, FF>,
  arg6: Kind<Kind<ForConst, O>, G>,
  arg7: Function1<Z, Tuple7<A, B, C, D, E, FF, G>>
): Const<O, Z> = arrow.core.Const
  .divide<O>(MO)
  .divide<A, B, C, D, E, FF, G, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as
  arrow.core.Const<O, Z>

@JvmName("divide")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(MO,arg1, arg2, arg3, arg4, arg5, arg6, arg7) { a, b, c, d, e, f, g, h -> arg8(Tuple8(a, b, c, d, e, f, g, h)) }",
    "arrow.core.Tuple8"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E, FF, G, H, Z> divide(
  MO: Monoid<O>,
  arg0: Kind<Kind<ForConst, O>, A>,
  arg1: Kind<Kind<ForConst, O>, B>,
  arg2: Kind<Kind<ForConst, O>, C>,
  arg3: Kind<Kind<ForConst, O>, D>,
  arg4: Kind<Kind<ForConst, O>, E>,
  arg5: Kind<Kind<ForConst, O>, FF>,
  arg6: Kind<Kind<ForConst, O>, G>,
  arg7: Kind<Kind<ForConst, O>, H>,
  arg8: Function1<Z, Tuple8<A, B, C, D, E, FF, G, H>>
): Const<O, Z> = arrow.core.Const
  .divide<O>(MO)
  .divide<A, B, C, D, E, FF, G, H, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as
  arrow.core.Const<O, Z>

@JvmName("divide")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(MO,arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)\n" +
      "{ a, b, c, d, e, f, g, h, i -> arg9(Tuple9(a, b, c, d, e, f, g, h, i)) }",
    "arrow.core.Tuple9"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E, FF, G, H, I, Z> divide(
  MO: Monoid<O>,
  arg0: Kind<Kind<ForConst, O>, A>,
  arg1: Kind<Kind<ForConst, O>, B>,
  arg2: Kind<Kind<ForConst, O>, C>,
  arg3: Kind<Kind<ForConst, O>, D>,
  arg4: Kind<Kind<ForConst, O>, E>,
  arg5: Kind<Kind<ForConst, O>, FF>,
  arg6: Kind<Kind<ForConst, O>, G>,
  arg7: Kind<Kind<ForConst, O>, H>,
  arg8: Kind<Kind<ForConst, O>, I>,
  arg9: Function1<Z, Tuple9<A, B, C, D, E, FF, G, H, I>>
): Const<O, Z> = arrow.core.Const
  .divide<O>(MO)
  .divide<A, B, C, D, E, FF, G, H, I,
    Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) as arrow.core.Const<O, Z>

@JvmName("divide")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(MO,arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)\n" +
      "{ a, b, c, d, e, f, g, h, i, j -> arg10(Tuple10(a, b, c, d, e, f, g, h, i, j)) }",
    "arrow.core.Tuple10"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E, FF, G, H, I, J, Z> divide(
  MO: Monoid<O>,
  arg0: Kind<Kind<ForConst, O>, A>,
  arg1: Kind<Kind<ForConst, O>, B>,
  arg2: Kind<Kind<ForConst, O>, C>,
  arg3: Kind<Kind<ForConst, O>, D>,
  arg4: Kind<Kind<ForConst, O>, E>,
  arg5: Kind<Kind<ForConst, O>, FF>,
  arg6: Kind<Kind<ForConst, O>, G>,
  arg7: Kind<Kind<ForConst, O>, H>,
  arg8: Kind<Kind<ForConst, O>, I>,
  arg9: Kind<Kind<ForConst, O>, J>,
  arg10: Function1<Z, Tuple10<A, B, C, D, E, FF, G, H, I, J>>
): Const<O, Z> = arrow.core.Const
  .divide<O>(MO)
  .divide<A, B, C, D, E, FF, G, H, I, J,
    Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) as arrow.core.Const<O, Z>

@JvmName("product")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zip(MO, arg1) { a, b -> Tuple2(a, b) }",
    "arrow.core.Tuple2"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B> Kind<Kind<ForConst, O>, A>.product(MO: Monoid<O>, arg1: Kind<Kind<ForConst, O>, B>):
  Const<O, Tuple2<A, B>> = arrow.core.Const.divide<O>(MO).run {
    this@product.product<A, B>(arg1) as arrow.core.Const<O, arrow.core.Tuple2<A, B>>
  }

@JvmName("product1")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zip(MO, arg1).map { ab, c -> Tuple3(ab.a, ab.b, c) }",
    "arrow.core.Tuple3"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C> Kind<Kind<ForConst, O>, Tuple2<A, B>>.product(
  MO: Monoid<O>,
  arg1: Kind<Kind<ForConst, O>, C>
): Const<O, Tuple3<A, B, C>> =
  arrow.core.Const.divide<O>(MO).run {
    this@product.product<A, B, C>(arg1) as arrow.core.Const<O, arrow.core.Tuple3<A, B, C>>
  }

@JvmName("product2")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zip(MO, arg1).map { abc, d -> Tuple4(abc.a, abc.b, abc.c, d) }",
    "arrow.core.Tuple4"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D> Kind<Kind<ForConst, O>, Tuple3<A, B, C>>.product(
  MO: Monoid<O>,
  arg1: Kind<Kind<ForConst, O>, D>
): Const<O, Tuple4<A, B, C, D>> =
  arrow.core.Const.divide<O>(MO).run {
    this@product.product<A, B, C, D>(arg1) as arrow.core.Const<O, arrow.core.Tuple4<A, B, C, D>>
  }

@JvmName("product3")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zip(MO, arg1).map { abcd, e -> Tuple5(abcd.a, abcd.b, abcd.c, abcd.d, e) }",
    "arrow.core.Tuple5"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E> Kind<Kind<ForConst, O>, Tuple4<A, B, C, D>>.product(
  MO: Monoid<O>,
  arg1: Kind<Kind<ForConst, O>, E>
): Const<O, Tuple5<A, B, C, D, E>> =
  arrow.core.Const.divide<O>(MO).run {
    this@product.product<A, B, C, D, E>(arg1) as arrow.core.Const<O, arrow.core.Tuple5<A, B, C, D, E>>
  }

@JvmName("product4")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zip(MO, arg1).map { abcde, f -> Tuple6(abcde.a, abcde.b, abcde.c, abcde.d, abcde.e, f) }",
    "arrow.core.Tuple6"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E, FF> Kind<Kind<ForConst, O>, Tuple5<A, B, C, D, E>>.product(
  MO: Monoid<O>,
  arg1: Kind<Kind<ForConst, O>, FF>
): Const<O, Tuple6<A, B, C, D, E, FF>> =
  arrow.core.Const.divide<O>(MO).run {
    this@product.product<A, B, C, D, E, FF>(arg1) as arrow.core.Const<O, arrow.core.Tuple6<A, B, C, D,
        E, FF>>
  }

@JvmName("product5")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zip(MO, arg1)\n" +
      ".map { abcdef, g -> Tuple7(abcdef.a, abcdef.b, abcdef.c, abcdef.d, abcdef.e, abcdef.f, g) }",
    "arrow.core.Tuple7"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E, FF, G> Kind<Kind<ForConst, O>, Tuple6<A, B, C, D, E,
    FF>>.product(MO: Monoid<O>, arg1: Kind<Kind<ForConst, O>, G>): Const<O, Tuple7<A, B, C, D, E,
    FF, G>> = arrow.core.Const.divide<O>(MO).run {
  this@product.product<A, B, C, D, E, FF, G>(arg1) as arrow.core.Const<O, arrow.core.Tuple7<A, B, C,
      D, E, FF, G>>
}

@JvmName("product6")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zip(MO, arg1)\n" +
      ".map { abcdefg, h -> Tuple8(abcdefg.a, abcdefg.b, abcdefg.c, abcdefg.d, abcdefg.e, abcdefg.f, abcdefg.g, h) }",
    "arrow.core.Tuple8"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E, FF, G, H> Kind<Kind<ForConst, O>, Tuple7<A, B, C, D, E, FF,
    G>>.product(MO: Monoid<O>, arg1: Kind<Kind<ForConst, O>, H>): Const<O, Tuple8<A, B, C, D, E, FF,
    G, H>> = arrow.core.Const.divide<O>(MO).run {
  this@product.product<A, B, C, D, E, FF, G, H>(arg1) as arrow.core.Const<O, arrow.core.Tuple8<A, B,
      C, D, E, FF, G, H>>
}

@JvmName("product7")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zip(MO, arg1)\n" +
      ".map { abcdefgh, i -> Tuple9(abcdefgh.a, abcdefgh.b, abcdefgh.c, abcdefgh.d, abcdefgh.e, abcdefgh.f, abcdefgh.g, abcdefgh.h, i) }",
    "arrow.core.Tuple9"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E, FF, G, H, I> Kind<Kind<ForConst, O>, Tuple8<A, B, C, D, E, FF, G,
    H>>.product(MO: Monoid<O>, arg1: Kind<Kind<ForConst, O>, I>): Const<O, Tuple9<A, B, C, D, E, FF,
    G, H, I>> = arrow.core.Const.divide<O>(MO).run {
  this@product.product<A, B, C, D, E, FF, G, H, I>(arg1) as arrow.core.Const<O, arrow.core.Tuple9<A,
      B, C, D, E, FF, G, H, I>>
}

@JvmName("product8")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zip(MO, arg1)\n" +
      ".map { abcdefghi, j -> Tuple10(abcdefghi.a, abcdefghi.b, abcdefghi.c, abcdefghi.d, abcdefghi.e, abcdefghi.f, abcdefghi.g, abcdefghi.h, abcdefghi.i, j) }",
    "arrow.core.Tuple10"
  ),
  DeprecationLevel.WARNING
)
fun <O, A, B, C, D, E, FF, G, H, I, J> Kind<Kind<ForConst, O>, Tuple9<A, B, C, D, E, FF, G, H,
    I>>.product(MO: Monoid<O>, arg1: Kind<Kind<ForConst, O>, J>): Const<O, Tuple10<A, B, C, D, E,
    FF, G, H, I, J>> = arrow.core.Const.divide<O>(MO).run {
  this@product.product<A, B, C, D, E, FF, G, H, I, J>(arg1) as arrow.core.Const<O,
    arrow.core.Tuple10<A, B, C, D, E, FF, G, H, I, J>>
}

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
@Deprecated(
  "Divide typeclass is deprecated. Use concrete methods on Const",
  level = DeprecationLevel.WARNING
)
inline fun <O> Companion.divide(MO: Monoid<O>): ConstDivideInstance<O> =
  object : arrow.core.extensions.ConstDivideInstance<O> {
    override fun MO(): arrow.typeclasses.Monoid<O> =
      MO
  }
