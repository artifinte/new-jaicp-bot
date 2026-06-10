theme: /

    state: hello
        q!: *start
        q!: *привет*
        q!: *здравствуй*
        random:
            a: Здравствуйте!
            a: Добрый день!
            a: Привет!

    state: weather
        q!: *погода*
        q!: *температура*
        a: Информация о погоде.

    state: currency
        q!: *курс*
        q!: *валюта*
        a: Информация о курсах валют.

    state: NoMatch
        event!: noMatch
        a: Я не понял запрос.