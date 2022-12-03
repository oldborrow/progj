import 'antd/dist/antd.css';
import React, {useEffect, useState} from "react";
import {Breadcrumb, Image, Layout, Menu} from 'antd';
import axios from 'axios';
import './styles/app.css'
import ListGroup from 'react-bootstrap/ListGroup';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Container from 'react-bootstrap/Container';
import {Button, Placeholder} from "react-bootstrap";
import Cards from "./Cards";
import logo from "./images/logo.png"
import { useNavigate } from "react-router-dom";

const { Header, Content, Footer } = Layout;

const App = () => {
    const [articles, setArticles] = useState([])
    const navigate = useNavigate()
    useEffect(() => {
        const fetchData = async () => {
            axios.get('http://localhost:8080/api/main')
                .then(res => {
                    setArticles(res.data)
                })
        }
        fetchData()

    }, [])
        return (
            <><Header style={{ position: 'sticky', top: 0, zIndex: 1, width: '100%', height: '103%'}}>
                <Row>
                    <Col sm={1}>
                        <img src={logo} style={{ width: 100, height: 100 }} alt={"logo"}/>
                    </Col>
                    <Col sm={3}><h1 style={{color: "white"}}>PROGJ</h1></Col>
                    <Col align={"right"}><Button style={{ width: 100, height: 50, backgroundColor: "white", color: "black" }} onClick={() => navigate("/editor")}>Редактор</Button>
                        <Button style={{ width: 100, height: 50, backgroundColor: "white", color: "black" }}>Войти</Button></Col></Row>
            </Header>
            <Container>
                <Row>
                </Row>
                <Row>
                    <Col sm/>
                    <Col sm>
                        <Cards articles={articles}/>
                    </Col>
                    <Col sm/>
                </Row>
            </Container>
                <Placeholder/>
                <Footer style={{ textAlign: 'center', background: 'whitesmoke', bottom: "0"}}>ProgJ ©2022 Created by me</Footer>
            </>
        );
}

export default App