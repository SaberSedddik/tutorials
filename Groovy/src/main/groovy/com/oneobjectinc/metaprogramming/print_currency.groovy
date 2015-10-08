package com.oneobjectinc.metaprogramming

import java.text.NumberFormat

/**
 * Created by saberseddik on 2015-10-07.
 */
Number.metaClass.formatCurrency = { Locale local ->
    NumberFormat.getCurrencyInstance(local).format(delegate)
}

println 123456.7890.formatCurrency(Locale.FRANCE)
assert 123456.7890.formatCurrency(Locale.FRANCE) == "123 456,79 \u20AC"