package arrow.core.extensions.sequencek.apply

import arrow.Kind
import arrow.core.Eval
import arrow.core.ForSequenceK
import arrow.core.SequenceK
import arrow.core.SequenceK.Companion
import arrow.core.Tuple10
import arrow.core.Tuple2
import arrow.core.Tuple3
import arrow.core.Tuple4
import arrow.core.Tuple5
import arrow.core.Tuple6
import arrow.core.Tuple7
import arrow.core.Tuple8
import arrow.core.Tuple9
import arrow.core.extensions.SequenceKApply

/**
 * cached extension
 */
@PublishedApi()
internal val apply_singleton: SequenceKApply = object : arrow.core.extensions.SequenceKApply {}

@JvmName("ap")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.ap(arg1)",
    "arrow.core.ap"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForSequenceK, A>.ap(arg1: Kind<ForSequenceK, Function1<A, B>>): SequenceK<B> =
  arrow.core.SequenceK.apply().run {
    this@ap.ap<A, B>(arg1) as arrow.core.SequenceK<B>
  }

@JvmName("apEval")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.apEval(arg1)",
    "arrow.core.apEval"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForSequenceK, A>.apEval(arg1: Eval<Kind<ForSequenceK, Function1<A, B>>>):
  Eval<Kind<ForSequenceK, B>> = arrow.core.SequenceK.apply().run {
    this@apEval.apEval<A, B>(arg1) as arrow.core.Eval<arrow.Kind<arrow.core.ForSequenceK, B>>
  }

@JvmName("map2Eval")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zipEval(arg1, arg2)",
    "arrow.core.zipEval"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, Z> Kind<ForSequenceK, A>.map2Eval(
  arg1: Eval<Kind<ForSequenceK, B>>,
  arg2: Function1<Tuple2<A, B>, Z>
): Eval<Kind<ForSequenceK, Z>> =
  arrow.core.SequenceK.apply().run {
    this@map2Eval.map2Eval<A, B, Z>(arg1, arg2) as arrow.core.Eval<arrow.Kind<arrow.core.ForSequenceK,
        Z>>
  }

@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1) { a, b -> arg2(Tuple2(a, b)) }",
    "arrow.core.zip",
    "arrow.core.Tuple2"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, Z> map(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Function1<Tuple2<A, B>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .map<A, B, Z>(arg0, arg1, arg2) as arrow.core.SequenceK<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1) { a, b -> arg2(Tuple2(a, b)) }",
    "arrow.core.zip",
    "arrow.core.Tuple2"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, Z> mapN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Function1<Tuple2<A, B>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .mapN<A, B, Z>(arg0, arg1, arg2) as arrow.core.SequenceK<Z>

@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2) { a, b, c -> arg2(Tuple3(a, b, c)) }",
    "arrow.core.zip",
    "arrow.core.Tuple3"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, Z> map(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Function1<Tuple3<A, B, C>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .map<A, B, C, Z>(arg0, arg1, arg2, arg3) as arrow.core.SequenceK<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2) { a, b, c -> arg2(Tuple3(a, b, c)) }",
    "arrow.core.zip",
    "arrow.core.Tuple3"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, Z> mapN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Function1<Tuple3<A, B, C>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .mapN<A, B, C, Z>(arg0, arg1, arg2, arg3) as arrow.core.SequenceK<Z>

@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3) { a, b, c, d -> arg2(Tuple4(a, b, c, d)) }",
    "arrow.core.zip",
    "arrow.core.Tuple4"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, Z> map(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Function1<Tuple4<A, B, C, D>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .map<A, B, C, D, Z>(arg0, arg1, arg2, arg3, arg4) as arrow.core.SequenceK<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3) { a, b, c, d -> arg2(Tuple4(a, b, c, d)) }",
    "arrow.core.zip",
    "arrow.core.Tuple4"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, Z> mapN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Function1<Tuple4<A, B, C, D>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .mapN<A, B, C, D, Z>(arg0, arg1, arg2, arg3, arg4) as arrow.core.SequenceK<Z>

@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4) { a, b, c, d, e -> arg2(Tuple5(a, b, c, d, e)) }",
    "arrow.core.zip",
    "arrow.core.Tuple5"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, Z> map(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Function1<Tuple5<A, B, C, D, E>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .map<A, B, C, D, E, Z>(arg0, arg1, arg2, arg3, arg4, arg5) as arrow.core.SequenceK<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4) { a, b, c, d, e -> arg2(Tuple5(a, b, c, d, e)) }",
    "arrow.core.zip",
    "arrow.core.Tuple5"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, Z> mapN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Function1<Tuple5<A, B, C, D, E>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .mapN<A, B, C, D, E, Z>(arg0, arg1, arg2, arg3, arg4, arg5) as arrow.core.SequenceK<Z>

@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5) { a, b, c, d, e, f -> arg2(Tuple6(a, b, c, d, e, f)) }",
    "arrow.core.zip",
    "arrow.core.Tuple6"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, Z> map(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Function1<Tuple6<A, B, C, D, E, FF>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .map<A, B, C, D, E, FF, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as arrow.core.SequenceK<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5) { a, b, c, d, e, f -> arg2(Tuple6(a, b, c, d, e, f)) }",
    "arrow.core.zip",
    "arrow.core.Tuple6"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, Z> mapN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Function1<Tuple6<A, B, C, D, E, FF>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .mapN<A, B, C, D, E, FF, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as arrow.core.SequenceK<Z>

@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6) { a, b, c, d, e, f, g -> arg2(Tuple7(a, b, c, d, e, f, g)) }",
    "arrow.core.zip",
    "arrow.core.Tuple7"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, Z> map(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Function1<Tuple7<A, B, C, D, E, FF, G>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .map<A, B, C, D, E, FF, G, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as
  arrow.core.SequenceK<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6) { a, b, c, d, e, f, g -> arg2(Tuple7(a, b, c, d, e, f, g)) }",
    "arrow.core.zip",
    "arrow.core.Tuple7"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, Z> mapN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Function1<Tuple7<A, B, C, D, E, FF, G>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .mapN<A, B, C, D, E, FF, G, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as
  arrow.core.SequenceK<Z>

@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7) { a, b, c, d, e, f, g, h -> arg2(Tuple8(a, b, c, d, e, f, g, h)) }",
    "arrow.core.zip",
    "arrow.core.Tuple8"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, Z> map(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>,
  arg8: Function1<Tuple8<A, B, C, D, E, FF, G, H>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .map<A, B, C, D, E, FF, G, H, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as
  arrow.core.SequenceK<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7) { a, b, c, d, e, f, g, h -> arg2(Tuple8(a, b, c, d, e, f, g, h)) }",
    "arrow.core.zip",
    "arrow.core.Tuple8"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, Z> mapN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>,
  arg8: Function1<Tuple8<A, B, C, D, E, FF, G, H>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .mapN<A, B, C, D, E, FF, G, H, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as
  arrow.core.SequenceK<Z>

@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) { a, b, c, d, e, f, g, h, i -> arg2(Tuple9(a, b, c, d, e, f, g, h, i)) }",
    "arrow.core.zip",
    "arrow.core.Tuple9"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, Z> map(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>,
  arg8: Kind<ForSequenceK, I>,
  arg9: Function1<Tuple9<A, B, C, D, E, FF, G, H, I>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .map<A, B, C, D, E, FF, G, H, I, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
  as arrow.core.SequenceK<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) { a, b, c, d, e, f, g, h, i -> arg2(Tuple9(a, b, c, d, e, f, g, h, i)) }",
    "arrow.core.zip",
    "arrow.core.Tuple9"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, Z> mapN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>,
  arg8: Kind<ForSequenceK, I>,
  arg9: Function1<Tuple9<A, B, C, D, E, FF, G, H, I>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .mapN<A, B, C, D, E, FF, G, H, I, Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
  as arrow.core.SequenceK<Z>

@JvmName("map")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) { a, b, c, d, e, f, g, h, i, j -> arg2(Tuple10(a, b, c, d, e, f, g, h, i, j)) }",
    "arrow.core.zip",
    "arrow.core.Tuple10"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, J, Z> map(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>,
  arg8: Kind<ForSequenceK, I>,
  arg9: Kind<ForSequenceK, J>,
  arg10: Function1<Tuple10<A, B, C, D, E, FF, G, H, I, J>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .map<A, B, C, D, E, FF, G, H, I, J,
    Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) as arrow.core.SequenceK<Z>

@JvmName("mapN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) { a, b, c, d, e, f, g, h, i, j -> arg2(Tuple10(a, b, c, d, e, f, g, h, i, j)) }",
    "arrow.core.zip",
    "arrow.core.Tuple10"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, J, Z> mapN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>,
  arg8: Kind<ForSequenceK, I>,
  arg9: Kind<ForSequenceK, J>,
  arg10: Function1<Tuple10<A, B, C, D, E, FF, G, H, I, J>, Z>
): SequenceK<Z> = arrow.core.SequenceK
  .apply()
  .mapN<A, B, C, D, E, FF, G, H, I, J,
    Z>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) as arrow.core.SequenceK<Z>

@JvmName("map2")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zip(arg1) { a, b -> arg2(Tuple2(a, b)) }"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, Z> Kind<ForSequenceK, A>.map2(
  arg1: Kind<ForSequenceK, B>,
  arg2: Function1<Tuple2<A, B>, Z>
): SequenceK<Z> = arrow.core.SequenceK.apply().run {
  this@map2.map2<A, B, Z>(arg1, arg2) as arrow.core.SequenceK<Z>
}

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
    "this.zip(arg1) { a, b -> Tuple2(a, b) }",
    "arrow.core.Tuple2"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForSequenceK, A>.product(arg1: Kind<ForSequenceK, B>): SequenceK<Tuple2<A, B>> =
  arrow.core.SequenceK.apply().run {
    this@product.product<A, B>(arg1) as arrow.core.SequenceK<arrow.core.Tuple2<A, B>>
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
    "this.zip(arg1) { (a, b), z -> Tuple3(a, b, z) }",
    "arrow.core.Tuple3"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, Z> Kind<ForSequenceK, Tuple2<A, B>>.product(arg1: Kind<ForSequenceK, Z>):
  SequenceK<Tuple3<A, B, Z>> = arrow.core.SequenceK.apply().run {
    this@product.product<A, B, Z>(arg1) as arrow.core.SequenceK<arrow.core.Tuple3<A, B, Z>>
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
    "this.zip(arg1) { (a, b, c), z -> Tuple4(a, b, c, z) }",
    "arrow.core.Tuple4"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, Z> Kind<ForSequenceK, Tuple3<A, B, C>>.product(arg1: Kind<ForSequenceK, Z>):
  SequenceK<Tuple4<A, B, C, Z>> = arrow.core.SequenceK.apply().run {
    this@product.product<A, B, C, Z>(arg1) as arrow.core.SequenceK<arrow.core.Tuple4<A, B, C, Z>>
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
    "this.zip(arg1) { (a, b, c, d), z -> Tuple5(a, b, c, d, z) }",
    "arrow.core.Tuple5"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, Z> Kind<ForSequenceK, Tuple4<A, B, C, D>>.product(arg1: Kind<ForSequenceK, Z>):
  SequenceK<Tuple5<A, B, C, D, Z>> = arrow.core.SequenceK.apply().run {
    this@product.product<A, B, C, D, Z>(arg1) as arrow.core.SequenceK<arrow.core.Tuple5<A, B, C, D,
        Z>>
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
    "this.zip(arg1) { (a, b, c, d, e), z -> Tuple6(a, b, c, d, e, z) }",
    "arrow.core.Tuple6"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, Z> Kind<ForSequenceK, Tuple5<A, B, C, D, E>>.product(
  arg1: Kind<ForSequenceK, Z>
): SequenceK<Tuple6<A, B, C, D, E, Z>> = arrow.core.SequenceK.apply().run {
  this@product.product<A, B, C, D, E, Z>(arg1) as arrow.core.SequenceK<arrow.core.Tuple6<A, B, C, D,
      E, Z>>
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
    "this.zip(arg1) { (a, b, c, d, e, f), z -> Tuple7(a, b, c, d, e, f, z) }",
    "arrow.core.Tuple7"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, Z> Kind<ForSequenceK, Tuple6<A, B, C, D, E,
    FF>>.product(arg1: Kind<ForSequenceK, Z>): SequenceK<Tuple7<A, B, C, D, E, FF, Z>> =
  arrow.core.SequenceK.apply().run {
    this@product.product<A, B, C, D, E, FF, Z>(arg1) as arrow.core.SequenceK<arrow.core.Tuple7<A, B,
        C, D, E, FF, Z>>
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
    "this.zip(arg1) { (a, b, c, d, e, f, g), z -> Tuple8(a, b, c, d, e, f, g, z) }",
    "arrow.core.Tuple8"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, Z> Kind<ForSequenceK, Tuple7<A, B, C, D, E, FF,
    G>>.product(arg1: Kind<ForSequenceK, Z>): SequenceK<Tuple8<A, B, C, D, E, FF, G, Z>> =
  arrow.core.SequenceK.apply().run {
    this@product.product<A, B, C, D, E, FF, G, Z>(arg1) as arrow.core.SequenceK<arrow.core.Tuple8<A,
        B, C, D, E, FF, G, Z>>
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
    "this.zip(arg1) { (a, b, c, d, e, f, g, h), z -> Tuple9(a, b, c, d, e, f, g, h, z) }",
    "arrow.core.Tuple9"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, Z> Kind<ForSequenceK, Tuple8<A, B, C, D, E, FF, G,
    H>>.product(arg1: Kind<ForSequenceK, Z>): SequenceK<Tuple9<A, B, C, D, E, FF, G, H, Z>> =
  arrow.core.SequenceK.apply().run {
    this@product.product<A, B, C, D, E, FF, G, H, Z>(arg1) as
      arrow.core.SequenceK<arrow.core.Tuple9<A, B, C, D, E, FF, G, H, Z>>
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
    "this.zip(arg1) { (a, b, c, d, e, f, g, h, i), z -> Tuple10(a, b, c, d, e, f, g, h, i, z) }",
    "arrow.core.Tuple10"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, Z> Kind<ForSequenceK, Tuple9<A, B, C, D, E, FF, G, H,
    I>>.product(arg1: Kind<ForSequenceK, Z>): SequenceK<Tuple10<A, B, C, D, E, FF, G, H, I, Z>> =
  arrow.core.SequenceK.apply().run {
    this@product.product<A, B, C, D, E, FF, G, H, I, Z>(arg1) as
      arrow.core.SequenceK<arrow.core.Tuple10<A, B, C, D, E, FF, G, H, I, Z>>
  }

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1) { a, b -> Tuple2(a, b) }",
    "arrow.core.zip",
    "arrow.core.Tuple2"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> tupled(arg0: Kind<ForSequenceK, A>, arg1: Kind<ForSequenceK, B>): SequenceK<Tuple2<A, B>> =
  arrow.core.SequenceK
    .apply()
    .tupled<A, B>(arg0, arg1) as arrow.core.SequenceK<arrow.core.Tuple2<A, B>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1) { a, b -> Tuple2(a, b) }",
    "arrow.core.zip",
    "arrow.core.Tuple2"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> tupledN(arg0: Kind<ForSequenceK, A>, arg1: Kind<ForSequenceK, B>): SequenceK<Tuple2<A,
    B>> = arrow.core.SequenceK
  .apply()
  .tupledN<A, B>(arg0, arg1) as arrow.core.SequenceK<arrow.core.Tuple2<A, B>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2) { a, b, c -> Tuple3(a, b, c) }",
    "arrow.core.zip",
    "arrow.core.Tuple3"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C> tupled(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>
): SequenceK<Tuple3<A, B, C>> = arrow.core.SequenceK
  .apply()
  .tupled<A, B, C>(arg0, arg1, arg2) as arrow.core.SequenceK<arrow.core.Tuple3<A, B, C>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2) { a, b, c -> Tuple3(a, b, c) }",
    "arrow.core.zip",
    "arrow.core.Tuple3"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C> tupledN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>
): SequenceK<Tuple3<A, B, C>> = arrow.core.SequenceK
  .apply()
  .tupledN<A, B, C>(arg0, arg1, arg2) as arrow.core.SequenceK<arrow.core.Tuple3<A, B, C>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3) { a, b, c, d -> Tuple4(a, b, c, d) }",
    "arrow.core.zip",
    "arrow.core.Tuple4"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D> tupled(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>
): SequenceK<Tuple4<A, B, C, D>> = arrow.core.SequenceK
  .apply()
  .tupled<A, B, C, D>(arg0, arg1, arg2, arg3) as arrow.core.SequenceK<arrow.core.Tuple4<A, B, C,
    D>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3) { a, b, c, d -> Tuple4(a, b, c, d) }",
    "arrow.core.zip",
    "arrow.core.Tuple4"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D> tupledN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>
): SequenceK<Tuple4<A, B, C, D>> = arrow.core.SequenceK
  .apply()
  .tupledN<A, B, C, D>(arg0, arg1, arg2, arg3) as arrow.core.SequenceK<arrow.core.Tuple4<A, B, C,
    D>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4) { a, b, c, d, e -> Tuple5(a, b, c, d, e) }",
    "arrow.core.zip",
    "arrow.core.Tuple5"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E> tupled(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>
): SequenceK<Tuple5<A, B, C, D, E>> = arrow.core.SequenceK
  .apply()
  .tupled<A, B, C, D, E>(arg0, arg1, arg2, arg3, arg4) as arrow.core.SequenceK<arrow.core.Tuple5<A,
    B, C, D, E>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4) { a, b, c, d, e -> Tuple5(a, b, c, d, e) }",
    "arrow.core.zip",
    "arrow.core.Tuple5"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E> tupledN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>
): SequenceK<Tuple5<A, B, C, D, E>> = arrow.core.SequenceK
  .apply()
  .tupledN<A, B, C, D, E>(arg0, arg1, arg2, arg3, arg4) as
  arrow.core.SequenceK<arrow.core.Tuple5<A, B, C, D, E>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5) { a, b, c, d, e, f -> Tuple6(a, b, c, d, e, f) }",
    "arrow.core.zip",
    "arrow.core.Tuple6"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF> tupled(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>
): SequenceK<Tuple6<A, B, C, D, E, FF>> = arrow.core.SequenceK
  .apply()
  .tupled<A, B, C, D, E, FF>(arg0, arg1, arg2, arg3, arg4, arg5) as
  arrow.core.SequenceK<arrow.core.Tuple6<A, B, C, D, E, FF>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5) { a, b, c, d, e, f -> Tuple6(a, b, c, d, e, f) }",
    "arrow.core.zip",
    "arrow.core.Tuple6"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF> tupledN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>
): SequenceK<Tuple6<A, B, C, D, E, FF>> = arrow.core.SequenceK
  .apply()
  .tupledN<A, B, C, D, E, FF>(arg0, arg1, arg2, arg3, arg4, arg5) as
  arrow.core.SequenceK<arrow.core.Tuple6<A, B, C, D, E, FF>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6) { a, b, c, d, e, f, g -> Tuple7(a, b, c, d, e, f, g) }",
    "arrow.core.zip",
    "arrow.core.Tuple7"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G> tupled(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>
): SequenceK<Tuple7<A, B, C, D, E, FF, G>> = arrow.core.SequenceK
  .apply()
  .tupled<A, B, C, D, E, FF, G>(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as
  arrow.core.SequenceK<arrow.core.Tuple7<A, B, C, D, E, FF, G>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6) { a, b, c, d, e, f, g -> Tuple7(a, b, c, d, e, f, g) }",
    "arrow.core.zip",
    "arrow.core.Tuple7"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G> tupledN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>
): SequenceK<Tuple7<A, B, C, D, E, FF, G>> = arrow.core.SequenceK
  .apply()
  .tupledN<A, B, C, D, E, FF, G>(arg0, arg1, arg2, arg3, arg4, arg5, arg6) as
  arrow.core.SequenceK<arrow.core.Tuple7<A, B, C, D, E, FF, G>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7) { a, b, c, d, e, f, g, h -> Tuple8(a, b, c, d, e, f, g, h) }",
    "arrow.core.zip",
    "arrow.core.Tuple8"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H> tupled(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>
): SequenceK<Tuple8<A, B, C, D, E, FF, G, H>> = arrow.core.SequenceK
  .apply()
  .tupled<A, B, C, D, E, FF, G, H>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as
  arrow.core.SequenceK<arrow.core.Tuple8<A, B, C, D, E, FF, G, H>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7) { a, b, c, d, e, f, g, h -> Tuple8(a, b, c, d, e, f, g, h) }",
    "arrow.core.zip",
    "arrow.core.Tuple8"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H> tupledN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>
): SequenceK<Tuple8<A, B, C, D, E, FF, G, H>> = arrow.core.SequenceK
  .apply()
  .tupledN<A, B, C, D, E, FF, G, H>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7) as
  arrow.core.SequenceK<arrow.core.Tuple8<A, B, C, D, E, FF, G, H>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) { a, b, c, d, e, f, g, h, i -> Tuple9(a, b, c, d, e, f, g, h, i) }",
    "arrow.core.zip",
    "arrow.core.Tuple9"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I> tupled(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>,
  arg8: Kind<ForSequenceK, I>
): SequenceK<Tuple9<A, B, C, D, E, FF, G, H, I>> = arrow.core.SequenceK
  .apply()
  .tupled<A, B, C, D, E, FF, G, H, I>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as
  arrow.core.SequenceK<arrow.core.Tuple9<A, B, C, D, E, FF, G, H, I>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) { a, b, c, d, e, f, g, h, i -> Tuple9(a, b, c, d, e, f, g, h, i) }",
    "arrow.core.zip",
    "arrow.core.Tuple9"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I> tupledN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>,
  arg8: Kind<ForSequenceK, I>
): SequenceK<Tuple9<A, B, C, D, E, FF, G, H, I>> = arrow.core.SequenceK
  .apply()
  .tupledN<A, B, C, D, E, FF, G, H, I>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) as
  arrow.core.SequenceK<arrow.core.Tuple9<A, B, C, D, E, FF, G, H, I>>

@JvmName("tupled")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) { a, b, c, d, e, f, g, h, i, j -> Tuple10(a, b, c, d, e, f, g, h, i, j) }",
    "arrow.core.zip",
    "arrow.core.Tuple10"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, J> tupled(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>,
  arg8: Kind<ForSequenceK, I>,
  arg9: Kind<ForSequenceK, J>
): SequenceK<Tuple10<A, B, C, D, E, FF, G, H, I, J>> = arrow.core.SequenceK
  .apply()
  .tupled<A, B, C, D, E, FF, G, H, I,
    J>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) as
  arrow.core.SequenceK<arrow.core.Tuple10<A, B, C, D, E, FF, G, H, I, J>>

@JvmName("tupledN")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "arg0.zip(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) { a, b, c, d, e, f, g, h, i, j -> Tuple10(a, b, c, d, e, f, g, h, i, j) }",
    "arrow.core.zip",
    "arrow.core.Tuple10"
  ),
  DeprecationLevel.WARNING
)
fun <A, B, C, D, E, FF, G, H, I, J> tupledN(
  arg0: Kind<ForSequenceK, A>,
  arg1: Kind<ForSequenceK, B>,
  arg2: Kind<ForSequenceK, C>,
  arg3: Kind<ForSequenceK, D>,
  arg4: Kind<ForSequenceK, E>,
  arg5: Kind<ForSequenceK, FF>,
  arg6: Kind<ForSequenceK, G>,
  arg7: Kind<ForSequenceK, H>,
  arg8: Kind<ForSequenceK, I>,
  arg9: Kind<ForSequenceK, J>
): SequenceK<Tuple10<A, B, C, D, E, FF, G, H, I, J>> = arrow.core.SequenceK
  .apply()
  .tupledN<A, B, C, D, E, FF, G, H, I,
    J>(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) as
  arrow.core.SequenceK<arrow.core.Tuple10<A, B, C, D, E, FF, G, H, I, J>>

@JvmName("followedBy")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.flatMap { arg1 }"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForSequenceK, A>.followedBy(arg1: Kind<ForSequenceK, B>): SequenceK<B> =
  arrow.core.SequenceK.apply().run {
    this@followedBy.followedBy<A, B>(arg1) as arrow.core.SequenceK<B>
  }

@JvmName("apTap")
@Suppress(
  "UNCHECKED_CAST",
  "USELESS_CAST",
  "EXTENSION_SHADOWED_BY_MEMBER",
  "UNUSED_PARAMETER"
)
@Deprecated(
  "@extension kinded projected functions are deprecated",
  ReplaceWith(
    "this.zip(arg1) { left, _ -> left }",
    "arrow.core.zip"
  ),
  DeprecationLevel.WARNING
)
fun <A, B> Kind<ForSequenceK, A>.apTap(arg1: Kind<ForSequenceK, B>): SequenceK<A> =
  arrow.core.SequenceK.apply().run {
    this@apTap.apTap<A, B>(arg1) as arrow.core.SequenceK<A>
  }

@Suppress(
  "UNCHECKED_CAST",
  "NOTHING_TO_INLINE"
)
@Deprecated(
  "Apply typeclass is deprecated. Use concrete methods on Sequence",
  level = DeprecationLevel.WARNING
)
inline fun Companion.apply(): SequenceKApply = apply_singleton
