package showcase

import mui.material.Backdrop
import mui.material.Button
import mui.material.CircularProgress
import react.Props
import react.dom.div
import react.fc
import react.useState

val Backdrop = fc<Props> {
    var open by useState(false)
    val handleClose = { open = false }
    val handleToggle = { open = !open }

    div {
        Button {
            // TODO: No possibility to legally set 'onClick' props [MUI]
            attrs.asDynamic().onClick = handleToggle
            +"Show backdrop"
        }
        Backdrop {
            // TODO: sx [MUI]
            //         sx={{ color: '#fff', zIndex: (theme) => theme.zIndex.drawer + 1 }}
            attrs.open = open
            // TODO: No possibility to legally set 'onClick' props [MUI]
            attrs.asDynamic().onClick = handleClose
            CircularProgress {
                attrs.color = "inherit"
            }
        }
    }
    /*

  return (
    <div>
      <Button onClick={handleToggle}>Show backdrop</Button>
      <Backdrop
        open={open}
        onClick={handleClose}
      >
        <CircularProgress color="inherit" />
      </Backdrop>
    </div>
  );
    * */
}