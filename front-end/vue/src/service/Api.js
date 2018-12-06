import axios from 'axios'

export default() => {
    return axios.create({
        baseURL: `http://limestone.sat.iit.edu/api/`,
        headers: {
            'Accept':'application/json'
        }
    })
}