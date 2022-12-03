import {useParams} from "react-router-dom";
import axios from "axios";
import {useEffect, useState} from "react";

const Article = () => {
    let params = useParams();
    const [article, setArticle] = useState([])
    useEffect(() => {
        const fetchData = async () => {
            axios.get(`http://localhost:8080/api/articles/${params.id}`)
                .then(res => {
                    setArticle(res.data)
                })
        }
        fetchData()
    }, [])

    console.log(article)
    return <><h1>{article.title}</h1>
    <h2>{article.preview_text}</h2>
        <h3>{article.content}</h3></>
}

export default Article