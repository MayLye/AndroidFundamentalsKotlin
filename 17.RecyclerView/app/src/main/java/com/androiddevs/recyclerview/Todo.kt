package com.androiddevs.recyclerview

// data class holds only data
data class Todo (
    // 'val' in kotlin is immutable, which means Constant.
    // 'var' in kotlin is mutable, which means Variable.
    val title: String,
    var isChecked: Boolean
)