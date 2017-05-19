/**
 * Клиент для фейкового API, берущий данные о сериалах со статических json'ов на i-madness.github.io.
 */
export default class ApiService {
    static findShow($http, title) {
        title = title.toLowerCase()
        return $http.get(`https://i-madness.github.io/api/tvshows/all.json`)
            .then(response => {
                let filterCondition = show => show.title.toLowerCase().match(`.*${title}.*`) || show.title_rus.toLowerCase().match(`.*${title}.*`)
                return Promise.resolve(response.data.filter(filterCondition))
            })
    }

    static fetchShowList($http, pageNum) {
        return $http.get(`https://i-madness.github.io/api/tvshows/page_${pageNum}.json`)
    }
}