package com.blez.Repository

import com.blez.models.ApiResponse
import com.blez.models.Hero


class HeroRepositoryImplementation : HeroRepository {
     override val heroes : Map<Int,List<Hero>> by lazy {
         mapOf(
             1 to page1,
             2 to page2,
             3 to page3,
             4 to page4,
             5 to page5
         )
     }
    override val page1: List<Hero> = listOf(
        Hero(
            id = 1,
            name = "Ichigo Kurosaki",
            image = "/heroes/Ichigo_Kurosaki1.jpg",
            about = "Ichigo Kurosaki (黒崎 一護, Kurosaki Ichigo) is a Human who is also a Substitute Shinigami. Ichigo is the son of Isshin and Masaki Kurosaki, and older brother of Karin and Yuzu. He is also married to Orihime Inoue and has a son named Kazui Kurosaki.",
            rating = 4.6,
            power = 98,
            month = "July",
            day = "15th",
            family = listOf(
                "Orihime Inoue (Wife)",
                "Kazui Kurosaki (Son)",
                "Isshin Kurosaki (Father)",
                "Masaki Kurosaki (Mother, deceased)",
                "Karin Kurosaki (Sister)",
                "Yuzu Kurosaki (Sister)"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "Immense Reiatsu",
                "Enhanced Strength",
                "Hollowfication",
                "Keen Intellect"
            ),
            bankai = "Tensa Zangetsu"
        ),
        Hero(
            id = 2,
            name = "Ichigo Kurosaki  \n(Evolved Hollowficated)",
            image = "/heroes/Ichigo_Kurosaki(Hollowfied).jpg",
            about = "Ichigo Kurosaki (黒崎 一護, Kurosaki Ichigo) is a Human who is also a Substitute Shinigami. Ichigo is the son of Isshin and Masaki Kurosaki, and older brother of Karin and Yuzu. He is also married to Orihime Inoue and has a son named Kazui Kurosaki.",
            rating = 5.0,
            power = 190,
            month = "July",
            day = "15th",
            family = listOf(
                "Orihime Inoue (Wife)",
                "Kazui Kurosaki (Son)",
                "Isshin Kurosaki (Father)",
                "Masaki Kurosaki (Mother, deceased)",
                "Karin Kurosaki (Sister)",
                "Yuzu Kurosaki (Sister)"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "Immense Reiatsu",
                "Enhanced Strength",
                "Hollowfication",
                "Keen Intellect",
                "Cero"
            ),
            bankai = "Tensa Zangetsu(Hollowficated)"
        ),
        Hero(
            id = 3,
            name = "Ichigo_Kurosaki \n(Hollowficated)",
            image = "/heroes/Ichigo(Hollowification 1).jpg",
            about = "Ichigo Kurosaki (黒崎 一護, Kurosaki Ichigo) is a Human who is also a Substitute Shinigami. Ichigo is the son of Isshin and Masaki Kurosaki, and older brother of Karin and Yuzu. He is also married to Orihime Inoue and has a son named Kazui Kurosaki.",
            rating = 5.0,
            power = 120,
            month = "July",
            day = "15th",
            family = listOf(
                "Orihime Inoue (Wife)",
                "Kazui Kurosaki (Son)",
                "Isshin Kurosaki (Father)",
                "Masaki Kurosaki (Mother, deceased)",
                "Karin Kurosaki (Sister)",
                "Yuzu Kurosaki (Sister)"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "Immense Reiatsu",
                "Enhanced Strength",
                "Hollowfication",
                "Keen Intellect"
            ),
            bankai = "Tensa Zangetsu(Hollowficated)"
        )
    )
    override val page2: List<Hero> = listOf(
        Hero(
            id = 4,
            name = "Ichigo Kurosaki \n(Mugetsu Form)",
            image = "/heroes/bleach-ichigo-mugetsu-wallpaper.jpg",
            about = "Ichigo Kurosaki (黒崎 一護, Kurosaki Ichigo) is a Human who is also a Substitute Shinigami. Ichigo is the son of Isshin and Masaki Kurosaki, and older brother of Karin and Yuzu. He is also married to Orihime Inoue and has a son named Kazui Kurosaki.",
            rating = 5.0,
            power = 240,
            month = "July",
            day = "15th",
            family = listOf(
                "Orihime Inoue (Wife)",
                "Kazui Kurosaki (Son)",
                "Isshin Kurosaki (Father)",
                "Masaki Kurosaki (Mother, deceased)",
                "Karin Kurosaki (Sister)",
                "Yuzu Kurosaki (Sister)"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "Immense Reiatsu",
                "Enhanced Strength",
                "Hollowfication",
                "Keen Intellect",
                "Final Getsuga Tenshou"

            ),
            bankai = "Final Getsuga Tenshou"
        ),
        Hero(
            id = 5,
            name = "Ichigo Kurosaki(True Form)",
            image = "/heroes/Ichigo_Kurosaki.png",
            about = "Ichigo Kurosaki (黒崎 一護, Kurosaki Ichigo) is a Human who is also a Substitute Shinigami. Ichigo is the son of Isshin and Masaki Kurosaki, and older brother of Karin and Yuzu. He is also married to Orihime Inoue and has a son named Kazui Kurosaki.",
            rating = 5.0,
            power = 250,
            month = "July",
            day = "15th",
            family = listOf(
                "Orihime Inoue (Wife)",
                "Kazui Kurosaki (Son)",
                "Isshin Kurosaki (Father)",
                "Masaki Kurosaki (Mother, deceased)",
                "Karin Kurosaki (Sister)",
                "Yuzu Kurosaki (Sister)"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "Immense Reiatsu",
                "Enhanced Strength",
                "Hollowfication",
                "Keen Intellect",
                "Dual Zengetsu"
            ),
            bankai = "Tensa Zangetsu"
        ),
        Hero(
            id = 6,
            name = "Orihime Inoue",
            image = "/heroes/Orihime_Inoue.jpg",
            about = "Orihime Inoue (井上 織姫, Inoue Orihime) is a Human living in Karakura Town. She is a former student of Karakura High School. She is married to Ichigo Kurosaki and has a son named Kazui Kurosaki.",
            rating = 4.8,
            power = 70,
            month = "September",
            day = "3th",
            family = listOf(
                "Ichigo Kurosaki (Husband)",
                "Kazui Kurosaki (Son)",
                "Isshin Kurosaki (Father-in-law)",
                "Masaki Kurosaki (Mother-in-law, deceased)",
                "Karin Kurosaki (Sister-in-law)",
                "Yuzu Kurosaki (Sister-in-law)",
                "Sora Inoue (Older Brother, deceased)"
            ),
            ablitites = listOf(
                "Spiritual Awareness",
                "Healer",
                "Empathy"
                ),
            bankai = "Shun Shun Rikka"
        )

    )
    override val page3: List<Hero> = listOf(
        Hero(
            id = 7,
            name = "Rukia Kuchiki",
            image = "/heroes/Rukia_Kuchiki.jpg",
            about = "Rukia Kuchiki (朽木 ルキア, Kuchiki Rukia) is the current captain of the 13th Division. She formerly served as lieutenant of the 13th Division under Captain Jūshirō Ukitake. Rukia is the adoptive sister of Byakuya Kuchiki, a friend of Ichigo Kurosaki, and is married to Renji Abarai.",
            rating = 4.5,
            power = 100,
            month = "January",
            day = "14th",
            family = listOf(
                "Renji Abarai (Husband)",
                "Ichika Abarai (Daughter)",
                "Hisana Kuchiki (Sister, deceased)",
                "Byakuya Kuchiki (Adoptive Brother/Brother-in-law)",
                "Ginrei Kuchiki (Adoptive Grandfather)",
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "Enhanced Strength",
                "Keen Intellect",
                "Hado Techniques"
            ),
            bankai = "Hakka no Togame"
        ),
        Hero(
            id = 8,
            name = "Renji Abarai",
            image = "/heroes/Renji_Abarai.jpg",
            about = "Renji Abarai (阿散井 恋次, Abarai Renji) is the lieutenant of the 6th Division under Captain Byakuya Kuchiki and is married to Rukia Kuchiki. He formerly served as the 6th Seat of the 11th Division under Kenpachi Zaraki.",
            rating = 4.0,
            power = 140,
            month = "August",
            day = "31th",
            family = listOf(
                "Rukia Kuchiki (Wife)",
                "Ichika Abarai (Daughter)",
                "Byakuya Kuchiki (Brother-in-law)"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "Enhanced Strength",
                "Keen Intellect",
                "Hado techniques"
            ),
            bankai = "Sōō Zabimaru"
        ),
        Hero(
            id = 9,
            name = "Uryū Ishida",
            image = "/heroes/Uryū_Ishida.png",
            about = "Uryū Ishida (石田 雨竜, Ishida Uryū) is a Gemischt Quincy residing in Karakura Town. He is a doctor at Karakura Hospital, and a friend of Ichigo Kurosaki. He is a former member of the Wandenreich's Sternritter with the designation \"A\" - \"Antithesis\",[5] formerly one of Yhwach's Schutzstaffel (親衛隊 (シュッツシュタッフェル), Shuttsushutafferu; German for \"Protective Echelon\", Japanese for \"Elite/Imperial Guards\"),[6] and was once designated as his future successor.",
            rating = 3.2,
            power = 110,
            month = "November",
            day = "6th",
            family = listOf(
                "Ryūken Ishida (Father)",
                "Sōken Ishida(Grandfather, deceased)",
                "Kanae Katagiri(Mother, deceased)"
            ),
            ablitites = listOf(
                "Auswählen Immunity",
                "Spiritual Awareness",
                "Seele Schneider",
                "Silver Arrowhead",
                "Enhanced Strength",
                "Hakumen Kudashi",
                "Keen Intellect"
            ),
            bankai = "Situation Reversal"
        )
    )
    override val page4: List<Hero> = listOf(
        Hero(
            id = 10,
            name = "Kenpachi Zaraki",
            image = "/heroes/Kenpachi_Zaraki.jpg",
            about = "Kenpachi Zaraki (更木 剣八, Zaraki Kenpachi) is the current captain of the 11th Division in the Gotei 13. He is the eleventh Kenpachi to hold the position.[3] His first lieutenant was Yachiru Kusajishi and his current lieutenant is Ikkaku Madarame.",
            rating = 4.1,
            power = 145,
            month = "November",
            day = "9th",
            family = listOf(
                "Yachiru Kusajishi(adoptive daughter)"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "Immense Reiatsu",
                "Enhanced Strength"
            ),
            bankai = "unnamed"
        ),
        Hero(
            id = 11,
            name = "Mayuri Kurotsuchi",
            image = "/heroes/Mayuri_Kurotsuchi.jpg",
            about = "Mayuri Kurotsuchi (涅 マユリ, Kurotsuchi Mayuri) is the captain of the 12th Division in the Gotei 13 and 2nd president of the Shinigami Research Institute. His previous lieutenant was Nemu Kurotsuchi, his artificially-created \"daughter\" and his current lieutenant is Akon. He formerly served as the 3rd Seat of the 12th Division under Kisuke Urahara.",
            rating = 5.0,
            power = 120,
            month = "March",
            day = "30th",
            family = listOf(
                "Nemu Kurotsuchi(created daughter, deceased)",
                "Nemuri Hachigō(created daughter)"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "IZanpakutō Modification Expert",
                "Enhanced Strength",
                "Body Modification Expert",
                "Genius Intellect"

            ),
            bankai = "Konjiki Ashisogi Jizō"
        ),
        Hero(
            id = 12,
            name = "Yhwach",
            image = "/heroes/Yhwach.jpg",
            about = "Yhwach (ユーハバッハ, Yūhabahha), often referred to simply as \"Your Majesty\" (陛下, heika) by his underlings, is the Father of the Quincy (滅却師 (クインシー)の父, Kuinshī no Chichi) and the emperor of the Wandenreich, with the designation \"A\" - \"The Almighty\". He is the son of the Soul King.",
            rating = 4.0,
            power = 300,
            month = "July",
            day = "15th",
            family = listOf(
                "Soul King"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "Immense Reiatsu",
                "Soul Distribution Power",
                "Soul Absorption",
                "Self-Power Restoration",
                "Blut Vene Anhaben "
            ),
            bankai = "Soul Distribution, Auswählen, The Almighty"
        )
    )
    override val page5: List<Hero> = listOf(
        Hero(
            id = 13,
            name = "Kisuke Urahara",
            image = "/heroes/Kisuke_Urahara.jpg",
            about = "Kisuke Urahara (浦原 喜助, Urahara Kisuke) is the former captain of the 12th Division, as well as the founder and 1st President of the S.R.D.I.. His lieutenant was Hiyori Sarugaki. He lives in the Human World where he owns a small convenience store which sells Shinigami items. He is assisted by his employees Tessai Tsukabishi, Jinta Hanakari, and Ururu Tsumugiya.",
            rating = 4.5,
            power = 150,
            month = "December",
            day = "31th",
            family = listOf(
                "Yoruichi Shihōin(Friend)"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "Immense Reiatsu",
                "Enhanced Strength",
                "Hakuda Master",
                "Keen Intellect"
            ),
            bankai = "Kannonbiraki Benihime Aratame"
        ),
        Hero(
            id = 14,
            name = "Yoruichi Shihōin",
            image = "/heroes/Yoruichi_Shihōin.jpg",
            about = "Yoruichi Shihōin (四楓院 夜一, Shihōin Yoruichi) is the former captain of the 2nd Division of the Gotei 13, as well as the former commander of the Onmitsukidō. Her Lieutenant was Marenoshin Ōmaeda. Having abandoned her command of both positions, she works with Kisuke Urahara and Tessai Tsukabishi, based in the Urahara Shop out in the Human World.",
            rating = 4.7,
            power = 130,
            month = "January ",
            day = "1th",
            family = listOf(
                "Kisuke Urahara(Friend)",
                "Yūshirō Shihōin (brother)"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Master Swordsman",
                "Immense Reiatsu",
                "Enhanced Strength",
                "Keen Intellect",
                "Beastification"
            ),
            bankai = "Shunkō"
        ),
        Hero(
            id = 15,
            name = "Yasutora Sado",
            image = "/heroes/Yasutora_Sado.jpg",
            about = "Yasutora Sado (茶渡 泰虎, Sado Yasutora), also known as Chad (チャド, Chado), is a Human living in Karakura Town. He is a professional boxer who participates in televised matches. He was a classmate of Ichigo Kurosaki's during their time at Karakura High School.",
            rating = 3.0,
            power = 90,
            month = "April",
            day = "7th",
            family = listOf(
                "Oscar Joaquín de la Rosa(Grandfather, Deceased)"
            ),
            ablitites = listOf(
                "Expert Hand-to-Hand Combatant",
                "Spiritual Awareness",
                "Fullbring",
                "Immense Reiatsu",
                "Enhanced Strength",
            ),
            bankai = "Brazo Izquierda del Diablo"
        )
    )


    override suspend fun getAllHeroes(page: Int): ApiResponse {
       return ApiResponse(
           success = true,
           message = "ok",
           prevPage = calculatePage(page = page)["prevPage"],
           nextPage = calculatePage(page = page)["nextPage"],
           heroes = heroes[page]!!,
           lastUpdated = System.currentTimeMillis()
       )
    }

    private fun calculatePage(page : Int) : Map<String,Int?>{
        var prevPage : Int? = page
        var nextPage : Int? = page
        if(page in 1..4)
            nextPage  = nextPage?.plus(1)
        if(page in 2..5)
            prevPage = prevPage?.minus(1)
        if (page == 1)
            prevPage = null
        if(page == 5)
            nextPage = null
        return mapOf("prevPage" to prevPage,"nextPage" to nextPage)
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return  ApiResponse(
            success = true,
            message = "ok",null,null,
            heroes = findHeroes(name = name)
        )
    }
    private fun findHeroes(name: String?): List<Hero> {
        val founded = mutableListOf<Hero>()
        return if (!name.isNullOrEmpty()){
            heroes.forEach {
                (_,heroes) ->
                heroes.forEach {hero ->
                    if(hero.name.lowercase().contains(name.lowercase()))
                        founded.add(hero)

                }
            }
            founded
        } else {
            emptyList()
        }




    }
}