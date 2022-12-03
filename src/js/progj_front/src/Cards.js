import Card from "react-bootstrap/Card";
import {Button, Placeholder} from "react-bootstrap";
import "holderjs";
import {useNavigate} from "react-router-dom";

const Cards = (props) => {
    console.log(props)
    const navigate = useNavigate()
    return props.articles.map(a=><>
        <Placeholder/>
        <Card style={{ width: '28rem' }}>
            <Card.Header><h4>{a.title}</h4></Card.Header>
        <Card.Body>
            <Card.Text>
                <h6>{a.preview_text}</h6>
            </Card.Text>
            <Button variant="dark" onClick={() => navigate(`/articles/${a.id}`)}>Читать</Button>
        </Card.Body>
    </Card>
    </>);


}
export default Cards