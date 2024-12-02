package com.dov4k1n.grammarforces.data

data class Lexicon(
    val id: Int,
    val word: String = "",
    val translation: String = ""
)

internal fun getAllVerbs(): Set<Lexicon> {
    return setOf(
        Lexicon(0, "be", "быть / являться / находиться"),
        Lexicon(1, "have", "иметь / обладать"),
        Lexicon(2, "do", "делать / заниматься"),
        Lexicon(3, "can", "мочь / уметь"),
        Lexicon(4, "go", "идти / ехать / проходить / уезжать"),
        Lexicon(5, "would", "бы"),
        Lexicon(6, "will", "намереваться / собираться"),
        Lexicon(7, "get", "получать / становиться / добираться"),
        Lexicon(8, "know", "знать"),
        Lexicon(9, "see", "видеть / увидеть"),
        Lexicon(10, "come", "приходить / приезжать"),
        Lexicon(11, "say", "говорить / сказать"),
        Lexicon(12, "think", "думать"),
        Lexicon(13, "look", "выглядеть / смотреть / взглянуть / глядеть"),
        Lexicon(14, "make", "делать / изготавливать / заставлять"),
        Lexicon(15, "take", "взять или брать / занимать (время, место)"),
        Lexicon(16, "want", "хотеть"),
        Lexicon(17, "tell", "рассказывать / говорить / сказать"),
        Lexicon(18, "give", "давать / отдавать / предоставлять"),
        Lexicon(19, "find", "находить / обнаруживать"),
        Lexicon(20, "feel", "чувствовать / ощущать"),
        Lexicon(21, "try", "пытаться / стараться / пробовать"),
        Lexicon(22, "may", "можно ли / может быть"),
        Lexicon(23, "hear", "слышать"),
        Lexicon(24, "seem", "казаться"),
        Lexicon(25, "leave", "оставить / покинуть / уйти"),
        Lexicon(26, "keep", "сохранять / хранить / держать / продолжать"),
        Lexicon(27, "stand", "стоять / встать"),
        Lexicon(28, "let", "позволять"),
        Lexicon(29, "hold", "держать / удерживать / придерживать / хранить"),
        Lexicon(30, "ask", "спросить / попросить"),
        Lexicon(31, "sit", "сидеть"),
        Lexicon(32, "must", "должен"),
        Lexicon(33, "should", "следовало бы / следует / должен"),
        Lexicon(34, "use", "использовать / воспользоваться / употреблять"),
        Lexicon(35, "put", "ставить / класть"),
        Lexicon(36, "move", "двигаться / перемещаться / передвигать / перемещать"),
        Lexicon(37, "begin", "начинать / приниматься"),
        Lexicon(38, "run", "бегать / работать / управлять"),
        Lexicon(39, "open", "открыть / раскрывать"),
        Lexicon(40, "call", "вызвать / позвать / позвонить / называть"),
        Lexicon(41, "start", "начинать / стартовать / запускать / приняться"),
        Lexicon(42, "walk", "идти / ходить / гулять"),
        Lexicon(43, "speak", "говорить / произносить"),
        Lexicon(44, "wait", "ждать / выжидать"),
        Lexicon(45, "bring", "принести / привести"),
        Lexicon(46, "happen", "происходить / случаться"),
        Lexicon(47, "watch", "наблюдать / смотреть"),
        Lexicon(48, "talk", "говорить / разговаривать"),
        Lexicon(49, "stop", "остановить / прекратить"),
        Lexicon(50, "fall", "падать"),
        Lexicon(51, "pull", "тянуть / тащить"),
        Lexicon(52, "reach", "достигать / дотягиваться"),
        Lexicon(53, "smile", "улыбаться"),
        Lexicon(54, "remember", "помнить / вспоминать"),
        Lexicon(55, "work", "работать"),
        Lexicon(56, "stare", "пристально смотреть / пялиться / уставиться"),
        Lexicon(57, "believe", "верить"),
        Lexicon(58, "follow", "следовать / руководствоваться"),
        Lexicon(59, "meet", "встречаться / встречать / знакомиться"),
        Lexicon(60, "die", "умирать / помирать"),
        Lexicon(61, "send", "отправлять / посылать"),
        Lexicon(62, "lie", "лежать"),
        Lexicon(63, "shake", "трясти / качать"),
        Lexicon(64, "become", "становиться"),
        Lexicon(65, "understand", "понимать"),
        Lexicon(66, "lose", "потерять / проиграть"),
        Lexicon(67, "show", "показывать / демонстрировать"),
        Lexicon(68, "pass", "проходить мимо / миновать"),
        Lexicon(69, "return", "вернуть / вернуться"),
        Lexicon(70, "catch", "ловить / поймать / уловить"),
        Lexicon(71, "live", "жить / проживать"),
        Lexicon(72, "break", "сломать / нарушить / разбить"),
        Lexicon(73, "nod", "кивать"),
        Lexicon(74, "mean", "значить / означать / иметь в виду"),
        Lexicon(75, "wear", "одевать / носить"),
        Lexicon(76, "build", "построить / создать"),
        Lexicon(77, "need", "нуждаться / иметь потребность"),
        Lexicon(78, "draw", "рисовать"),
        Lexicon(79, "suppose", "полагать / предполагать"),
        Lexicon(80, "miss", "пропустить / скучать / промахнуться"),
        Lexicon(81, "grow", "расти / выращивать"),
        Lexicon(82, "lead", "возглавлять / вести"),
        Lexicon(83, "carry", "нести"),
        Lexicon(84, "close", "закрыть"),
        Lexicon(85, "read", "читать / прочитать"),
        Lexicon(86, "drive", "управлять автомобилем / водить машину"),
        Lexicon(87, "might", "можно / мочь"),
        Lexicon(88, "expect", "ожидать"),
        Lexicon(89, "change", "изменять / менять / переодевать"),
        Lexicon(90, "learn", "учиться / изучать / узнавать"),
        Lexicon(91, "listen", "слушать / выслушать"),
        Lexicon(92, "throw", "бросать / кидать"),
        Lexicon(93, "appear", "появляться / казаться"),
        Lexicon(94, "lean", "наклоняться / опираться"),
        Lexicon(95, "push", "толкать / подталкивать"),
        Lexicon(96, "eat", "есть / поедать / жрать"),
        Lexicon(97, "write", "писать"),
        Lexicon(98, "cut", "резать / стричь"),
        Lexicon(99, "hope", "надеяться"),
        Lexicon(100, "play", "играть / играть роль"),
        Lexicon(101, "hit", "ударять / поражать"),
        Lexicon(102, "ride", "кататься / ехать"),
        Lexicon(103, "drink", "пить / выпить"),
        Lexicon(104, "fly", "летать / прилететь"),
        Lexicon(105, "touch", "трогать / касаться"),
        Lexicon(106, "fill", "заполнять / наполнять"),
        Lexicon(107, "forget", "забывать"),
        Lexicon(108, "continue", "продолжать / продолжаться"),
        Lexicon(109, "stay", "оставаться"),
        Lexicon(110, "travel", "путешествовать"),
        Lexicon(111, "finish", "заканчивать / завершать"),
        Lexicon(112, "shall", "следует"),
        Lexicon(113, "sound", "звучать"),
        Lexicon(114, "damn", "проклинать / осуждать"),
        Lexicon(115, "notice", "заметить"),
        Lexicon(116, "enter", "входить / вводить"),
        Lexicon(117, "arrive", "прибыть"),
        Lexicon(118, "cover", "покрывать / накрывать"),
        Lexicon(119, "help", "помогать / оказывать помощь"),
        Lexicon(120, "save", "спасти / уберечь / сохранить"),
        Lexicon(121, "pay", "платить / заплатить"),
        Lexicon(122, "sleep", "спать / поспать"),
        Lexicon(123, "spend", "тратить / растратить / проводить (время)"),
        Lexicon(124, "check", "проверять / сверять"),
        Lexicon(125, "like", "нравиться / любить"),
        Lexicon(126, "cross", "пересекать / перечеркивать / скрещивать"),
        Lexicon(127, "love", "любить"),
        Lexicon(128, "hurt", "причинять боль / ранить"),
        Lexicon(129, "climb", "взбираться / карабкаться / подниматься"),
        Lexicon(130, "offer", "предлагать"),
        Lexicon(131, "explain", "объяснять / разъяснять"),
        Lexicon(132, "shut", "захлопнуть / закрывать"),
        Lexicon(133, "buy", "покупать"),
        Lexicon(134, "join", "присоединяться / соединять"),
        Lexicon(135, "answer", "отвечать"),
        Lexicon(136, "study", "изучать"),
        Lexicon(137, "shout", "кричать / выкрикивать"),
        Lexicon(138, "wish", "желать / хотеть"),
        Lexicon(139, "jump", "прыгать / скакать"),
        Lexicon(140, "cannot", "не мочь"),
        Lexicon(141, "thank", "благодарить"),
        Lexicon(142, "cry", "плакать / кричать"),
        Lexicon(143, "wake", "просыпаться / будить"),
        Lexicon(144, "add", "добавлять / прибавлять"),
        Lexicon(145, "choose", "выбирать / избрать"),
        Lexicon(146, "dress", "одеваться / одевать"),
        Lexicon(147, "serve", "служить / подавать"),
        Lexicon(148, "plan", "планировать / спланировать"),
        Lexicon(149, "hurry", "спешить / торопиться"),
        Lexicon(150, "interest", "интересовать / заинтересовать"),
        Lexicon(151, "enjoy", "наслаждаться / получать удовольствие"),
        Lexicon(152, "order", "приказывать / заказывать"),
        Lexicon(153, "end", "закончить / закончиться"),
        Lexicon(154, "turn", "повернуть / повернуться / развернуться"),
        Lexicon(155, "win", "выигрывать / побеждать"),
        Lexicon(156, "worry", "волноваться / беспокоиться"),
        Lexicon(157, "agree", "соглашаться / договариваться"),
        Lexicon(158, "knock", "стучать"),
        Lexicon(159, "discover", "делать открытие / обнаруживать / находить"),
        Lexicon(160, "kiss", "целовать / поцеловать"),
        Lexicon(161, "search", "искать / обыскивать"),
        Lexicon(162, "fail", "потерпеть неудачу / провалить"),
        Lexicon(163, "teach", "учить / преподавать"),
        Lexicon(164, "cause", "причинять / быть причиной"),
        Lexicon(165, "sell", "продавать"),
        Lexicon(166, "prepare", "подготавливать / готовить"),
        Lexicon(167, "sigh", "вздыхать / охать"),
        Lexicon(168, "park", "парковать / ставить на стоянку"),
        Lexicon(169, "ignore", "игнорировать / пренебрегать"),
        Lexicon(170, "steal", "красть / воровать"),
        Lexicon(171, "gaze", "вглядываться / смотреть пристально"),
        Lexicon(172, "glow", "светиться / пылать"),
        Lexicon(173, "receive", "получать / принимать"),
        Lexicon(174, "sing", "петь / воспевать"),
        Lexicon(175, "hate", "ненавидеть"),
        Lexicon(176, "paint", "красить"),
        Lexicon(177, "roar", "реветь / рычать"),
        Lexicon(178, "glare", "сверкать / сверкать глазами"),
        Lexicon(179, "exist", "существовать"),
        Lexicon(180, "share", "разделять / делиться / делить"),
        Lexicon(181, "smell", "пахнуть / чувствовать запах"),
        Lexicon(182, "seat", "усаживать / рассаживать"),
        Lexicon(183, "roll", "сворачивать / катить"),
        Lexicon(184, "allow", "разрешать / позволять"),
        Lexicon(185, "wave", "махать"),
        Lexicon(186, "manage", "справиться / суметь / управлять"),
        Lexicon(187, "consider", "рассматривать"),
        Lexicon(188, "approach", "приближаться / подходить"),
        Lexicon(189, "imagine", "воображать / представлять себе"),
        Lexicon(190, "rush", "ринуться / бросаться / мчаться / торопить"),
        Lexicon(191, "bend", "гнуть / сгибать"),
        Lexicon(192, "pour", "наливать / разливать"),
        Lexicon(193, "suggest", "предлагать / подсказывать"),
        Lexicon(194, "shine", "сиять / светить"),
        Lexicon(195, "remove", "снимать / устранять / удалять"),
        Lexicon(196, "rest", "отдыхать"),
        Lexicon(197, "protect", "защищать"),
        Lexicon(198, "refuse", "отказываться / отказывать"),
        Lexicon(199, "mention", "упоминать"),
        )
}