import React from 'react';
import ReactDOM from 'react-dom/client';
import './styles/index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {
    BrowserRouter,
    Routes,
    Route,
} from "react-router-dom";
import MyEditor from "./MyEditor";
import 'bootstrap/dist/css/bootstrap.min.css';
import Article from "./Article";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <BrowserRouter>
    <Routes>
        <Route path="/" element={<App />}/>
        <Route path="/editor" element={<MyEditor />}/>
        <Route path="/articles/:id"
                element={<Article/>}/>
    </Routes>
    </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
