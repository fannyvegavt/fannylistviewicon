package com.example.fannylistviewicon.model

import com.example.fannylistviewicon.R

object listcode {
    private val codename = arrayOf(
        "Ruby",
        "Rails",
        "Python",
        "Javascript",
        "PHP"
    )

    private val codedetail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language",
        "Ruby on Rails is a server-side framework written in Ruby language",
        "Python is interpreted scripting and object-oriented programming language",
        "JavaScrip is an object-based scripting language",
        "PHP is an interpreted language,i.e, there is no need for compilstion"
    )

    private val codelogo = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.javascript,
        R.drawable.php
    )

    val listofcode: ArrayList<Coded>
        get() {
            val list = arrayListOf<Coded>()
            for (position in codename.indices) {
                val cd = Coded()
                cd.name = codename[position]
                cd.detail = codedetail[position]
                cd.logo = codelogo[position]
                list.add(cd)
            }
            return list
        }
}