import React, { Component } from 'react';
import axios from 'axios';
import '../App.css'

export default class project extends Component {
  state = {Data:[],
    projectName:'',
    projectDescription:'',
  }
  handleChange=(e)=>{
    // console.log(e.target.value)
    this.setState({ projectName:e.target.value  });
  }

  handleChange2=(a)=>{
    // console.log(a.target.value);
    this.setState({ projectDescription: a.target.value });
  }
  handleDelete = id => {
    axios.delete('http://localhost:8080/defectTracker/api/p1/project/' + id)
        .then(res => {
            if (res.status === 200) {
                this.componentDidMount()
            }
        })
}

  handleAdd=(e)=>{
    //stop reloading
    e.preventDefault()
    axios.post('http://localhost:8080/defectTracker/api/p1/project',{projectName:this.state.projectName, projectDescription:this.state.projectDescription})

    this.setState({projectName : '', projectDescription:'' });
  }

componentDidMount() {
  axios.get('http://localhost:8080/defectTracker/api/p1/project')
  .then(result => {
    // console.log(result)
    this.setState({ Data:result.data  });

  })
  // console.log(this.state.projectName)
}



    render() {
      console.log(this.state)
        return (

<div className="wrapper">     
<div className="main_content">
    <div className= "header">
  <form>
        <label htmlFor="Name">Project Name</label>
        <input type="text" id="name" name="pname" placeholder="Project Name.." onChange={this.handleChange} value={this.state.projectName}></input>

   

    {/* <label for="subject">Subject</label>
    <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea> */}

    {/* <form action="/action_page.php"> */}
    <label htmlFor="Name"> Project Description</label>
    <input type="text" name="message" rows="10" cols="80" placeholder="Project Description.." onChange={this.handleChange2} value={this.state.projectDescription}/>

    <input type="submit" value="Submit" onClick={this.handleAdd}/> &nbsp;&nbsp; &nbsp;&nbsp;
    <input type="submit" value="Reset" />
    
  </form>

       
  <div classNam="table-wrapper">
    <table className="fl-table">
      <thead>
      <tr>
        <th>Name</th>
        <th>Description</th>
      </tr>

      </thead>
      <tbody>
      {
        this.state.Data.map(p=>{
          return(
            <tr key={p.id}>
              <td>{p.projectName}</td>
              <td>{p.projectDescription}</td>
              <td>  <a href={`/editProject/${p.id}`} > <input type="submit" value="Edit" /></a></td>
              <td><input type="submit" value="Delete" onClick={() => this.handleDelete(p.id)} /></td>
              
            </tr>)
        })}
        
      
      

      </tbody>

      


    </table>
    </div>
    

  </div>
</div>



</div>
        )
    }
}

