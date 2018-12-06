import axios from 'axios'

/* Set Base URL for the REST calls */
export default() => {
    return axios.create({
        baseURL: `http://limestone.sat.iit.edu/api/`,
        headers: {
            'Accept':'application/json'
        }
    })
}